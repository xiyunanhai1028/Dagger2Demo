package lvjia.com.dagger2demo.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import lvjia.com.dagger2demo.R;
import lvjia.com.dagger2demo.ToastUtils;
import lvjia.com.dagger2demo.di.component.MainFragmentComponet;
import lvjia.com.dagger2demo.presenter.MainPresenter;

public class MainFragment extends BaseFragment implements MainPresenter.IUserView {

    @Inject
    ToastUtils toastUtils;

    @Inject
    MainPresenter mainPresenter;
    private MainFragmentComponet mainFragmentComponet;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        view.findViewById(R.id.get_user).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainPresenter.getUser();
            }
        });
        view.findViewById(R.id.show_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastUtils.showToast("依赖注入获取到的toast");
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(getActivity() instanceof  MainActivity){
            mainFragmentComponet = ((MainActivity) getActivity()).getMainComponent().mainFragmentComponent();
            mainFragmentComponet.inject(this);
            mainPresenter.setiUserView(this);
        }
    }

    @Override
    public void setUserName(String userName) {
        ((TextView)getView().findViewById(R.id.user_info)).setText(userName);
    }
}
