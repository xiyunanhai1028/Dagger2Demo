package lvjia.com.dagger2demo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lvjia.com.dagger2demo.App;
import lvjia.com.dagger2demo.R;
import lvjia.com.dagger2demo.di.component.DaggerActivityComponent;
import lvjia.com.dagger2demo.di.component.DaggerMainComponent;
import lvjia.com.dagger2demo.di.component.MainComponent;
import lvjia.com.dagger2demo.di.module.ActivityModule;
import lvjia.com.dagger2demo.di.module.MainModule;

public class MainActivity extends BaseActivity {

    private MainComponent mainComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainComponent = DaggerMainComponent.builder().appComponent(getAppComponent())
                .activityModule(new ActivityModule(this)).mainModule(new MainModule()).build();
        mainComponent.inject(this);
    }

    public MainComponent getMainComponent() {
        return mainComponent;
    }


}
