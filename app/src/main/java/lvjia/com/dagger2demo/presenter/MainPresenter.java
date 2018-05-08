package lvjia.com.dagger2demo.presenter;

import javax.inject.Inject;

import lvjia.com.dagger2demo.data.GetUserData;
import lvjia.com.dagger2demo.data.UserData;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:
 */
public class MainPresenter {
    public GetUserData getUserData;
    private IUserView iUserView;
    @Inject
    public MainPresenter(GetUserData getUserData) {
        this.getUserData = getUserData;
    }

    public void getUser(){
        UserData userData=this.getUserData.getUser();
        iUserView.setUserName(userData.userName);
    }

    public void setiUserView(IUserView iUserView) {
        this.iUserView = iUserView;
    }

    public static  interface IUserView{
        void setUserName(String userName);
    }
}
