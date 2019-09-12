package com.dizan.mlicxapp.activitys;

import android.os.Bundle;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dizan.mlicxapp.R;
import com.dizan.mlicxapp.adapters.OnliveGridAdapter;
import com.dizan.mlicxapp.adapters.OnliveListAdapter;
import com.dizan.mlicxapp.views.GridSpaceItemDecoration;

public class MainActivity extends BaseActivity {

    private RecyclerView mRvGrid, mRvList;
    private OnliveGridAdapter mGridAdapter;
    private OnliveListAdapter mListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();  // 初始化
    }

    /**
     * 初始化View
     */
    private void initView() {
        initNavBar(false,"美丽畅想", true);

        mRvGrid = fd(R.id.rv_grid);
        mRvGrid.setLayoutManager(new GridLayoutManager(this, 3));
        mRvGrid.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.albumMarginSize), mRvGrid));
        mRvGrid.setNestedScrollingEnabled(false);
        mGridAdapter = new OnliveGridAdapter(this);
        mRvGrid.setAdapter(mGridAdapter);

        mRvList = fd(R.id.rv_list);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        mRvList.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mRvList.setNestedScrollingEnabled(false);
        mListAdapter = new OnliveListAdapter(this, mRvList);
        mRvList.setAdapter(mListAdapter);
    }
}
