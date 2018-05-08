package lvjia.com.dagger2demo.view;

import android.support.v7.app.AppCompatActivity;

import lvjia.com.dagger2demo.App;
import lvjia.com.dagger2demo.di.component.AppComponent;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:
 */
public class BaseActivity extends AppCompatActivity {
    public AppComponent getAppComponent(){
        return ((App)getApplication()).getAppComponent();
    }
}
