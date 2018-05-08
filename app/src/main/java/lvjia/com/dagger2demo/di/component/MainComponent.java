package lvjia.com.dagger2demo.di.component;

import dagger.Component;
import lvjia.com.dagger2demo.view.MainActivity;
import lvjia.com.dagger2demo.di.module.ActivityModule;
import lvjia.com.dagger2demo.di.module.MainModule;
import lvjia.com.dagger2demo.di.scope.PerActivity;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:
 */
@PerActivity
@Component(dependencies = AppComponent.class,modules = {MainModule.class, ActivityModule.class})
public interface MainComponent extends ActivityComponent{
    //对MainActivity进行依赖注入
    void inject(MainActivity mainActivity);

    MainFragmentComponet mainFragmentComponent();
}
