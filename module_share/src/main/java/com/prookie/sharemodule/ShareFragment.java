package com.prookie.sharemodule;

import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hansintelligent.rrrmvpframework.base.BaseFragment;

/**
 * Created by brin on 2018/7/18.
 */
@Route(path = "/share/shareFragment")
public class ShareFragment extends BaseFragment {

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_share;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}
