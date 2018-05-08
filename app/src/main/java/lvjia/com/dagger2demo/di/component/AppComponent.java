package lvjia.com.dagger2demo.di.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import lvjia.com.dagger2demo.Navigator;
import lvjia.com.dagger2demo.ToastUtils;
import lvjia.com.dagger2demo.di.module.AppModule;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getContext();
    ToastUtils getToastUtils();
    Navigator getNavigator();
}
