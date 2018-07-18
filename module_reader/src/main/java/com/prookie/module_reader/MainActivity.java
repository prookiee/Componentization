package com.prookie.module_reader;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.hansintelligent.rrrmvpframework.adapter.FragmentAdapter;
import com.hansintelligent.rrrmvpframework.base.BaseFragment;
import com.hansintelligent.rrrmvpframework.utils.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * MainActivity
 */
@Route(path = "/reader/mainActivity")
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d(TAG, "onCreate");
        findViewById(R.id.tv_reader).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ARouter.getInstance().build("/reader/bActivity").navigation();
                ARouter.getInstance().build("/share/shareActivity").navigation();
            }
        });
        viewPager = ((ViewPager) findViewById(R.id.viewPager));
        List<Fragment> fragmentList = new ArrayList<>();
        //获取fragment实例
        BaseFragment fragment = ((BaseFragment) ARouter.getInstance().build("/share/shareFragment").navigation());
        fragmentList.add(fragment);
        viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager(), fragmentList));
        viewPager.setCurrentItem(0);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.d(TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.d(TAG, "onStop");
    }
}
