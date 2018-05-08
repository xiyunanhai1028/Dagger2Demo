package lvjia.com.dagger2demo;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Singleton;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:
 */
@Singleton
public class ToastUtils {
    private Context context;

    public ToastUtils(Context context) {
        this.context = context;
    }

    public void showToast(String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
