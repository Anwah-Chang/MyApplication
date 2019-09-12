package com.dizan.mlicxapp.activitys;

import android.os.Bundle;
import android.view.View;

import com.dizan.mlicxapp.R;

public class ChangePasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        initView();  // 初始化View
    }

    /**
     * 初始化
     */
    private void initView() {
        initNavBar(true, "修改密码", false);
    }

    /**
     * 确认修改密码点击事件
     */
    public void onCommitClick(View v) {

    }
}
