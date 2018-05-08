package lvjia.com.dagger2demo.di.component;

import android.app.Activity;

import dagger.Component;
import lvjia.com.dagger2demo.di.module.ActivityModule;
import lvjia.com.dagger2demo.di.scope.PerActivity;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:
 */
@PerActivity
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {
    Activity getActivity();
}
