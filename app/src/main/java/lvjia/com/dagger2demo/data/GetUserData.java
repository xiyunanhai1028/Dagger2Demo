package lvjia.com.dagger2demo.data;

import javax.inject.Inject;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:
 */
public class GetUserData {
    @Inject
    public GetUserData() {
    }

    public UserData getUser(){
        UserData userData=new UserData();
        userData.userName="adfghhjjkk";
        return userData;
    }
}
