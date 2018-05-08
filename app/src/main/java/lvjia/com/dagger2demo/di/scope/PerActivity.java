package lvjia.com.dagger2demo.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author dufeihu
 * @date 2018/5/8 0008.
 * @desc:Activity级别作用域
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {

}
