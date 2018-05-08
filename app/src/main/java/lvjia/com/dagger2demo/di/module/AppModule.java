package lvjia.com.dagger2demo.di.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import lvjia.com.dagger2demo.Navigator;
import lvjia.com.dagger2demo.ToastUtils;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:Application级别的Module
 */
@Module
public class AppModule {
   Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public Context provideContext(){
        return context;
    }

    @Singleton
    @Provides
    public ToastUtils provideToastUtils(){
        return new ToastUtils(context);
    }

    @Singleton
    @Provides
    public Navigator provideNavigator(){
        return new Navigator();
    }
}
