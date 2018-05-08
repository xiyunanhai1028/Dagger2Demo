package lvjia.com.dagger2demo.di.component;

import dagger.Component;
import dagger.Subcomponent;
import lvjia.com.dagger2demo.di.scope.PerActivity;
import lvjia.com.dagger2demo.view.MainFragment;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:
 */
@PerActivity
@Subcomponent
public interface MainFragmentComponet extends AppComponent {
    void inject(MainFragment mainFragment);
}
