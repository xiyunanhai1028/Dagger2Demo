package lvjia.com.dagger2demo.di.module;

import dagger.Module;
import dagger.Provides;
import lvjia.com.dagger2demo.data.GetUserData;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:
 */
@Module
public class MainModule {
    @Provides
    public GetUserData provideGetUserData(){
        return new GetUserData();
    }
}
