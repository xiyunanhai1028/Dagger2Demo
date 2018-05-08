package lvjia.com.dagger2demo;

import android.app.Application;

import lvjia.com.dagger2demo.di.component.AppComponent;
import lvjia.com.dagger2demo.di.component.DaggerAppComponent;
import lvjia.com.dagger2demo.di.module.AppModule;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:
 */
public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
