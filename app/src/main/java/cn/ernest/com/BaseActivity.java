package cn.ernest.com;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.ernest.ioc.view.ViewInjectUtils;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewInjectUtils.inject(this);

        initView();
    }

    public void initView() {
    }


}
