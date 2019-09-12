package com.dizan.mlicxapp.activitys;

import android.os.Bundle;
import android.view.View;

import com.dizan.mlicxapp.R;

public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        
        initView();  // 初始化
    }

    /**
     * 初始化View
     */
    private void initView() {
        initNavBar(true, "注册", false);
    }

    /**
     * 注册按钮点击事件
     * @param v
     */
    public void onRegisterClick(View v){

    }
}
