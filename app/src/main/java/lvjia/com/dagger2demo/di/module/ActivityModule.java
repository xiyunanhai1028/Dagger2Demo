package lvjia.com.dagger2demo.di.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import lvjia.com.dagger2demo.di.scope.PerActivity;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:Activity级别的Module
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @PerActivity
    @Provides
    public Activity provideActivity(){
        return activity;
    }
}
