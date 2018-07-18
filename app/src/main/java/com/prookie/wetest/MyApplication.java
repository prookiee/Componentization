package com.prookie.wetest;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hansintelligent.rrrmvpframework.application.BaseApplication;

/**
 * MyApplication
 * Created by brin on 2018/7/17.
 */

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
