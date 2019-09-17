package com.dizan.mlicxapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dizan.mlicxapp.R;



public class OnliveListAdapter extends RecyclerView.Adapter<OnliveListAdapter.ViewHolder> {

    private Context mContext;
    private View mItemView;
    private RecyclerView mRv;
    private boolean isCalcaulationRyHeight;

    public OnliveListAdapter (Context context, RecyclerView recyclerView) {

        mContext = context;
        mRv = recyclerView;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        mItemView = LayoutInflater.from(mContext).inflate(R.layout.item_list_onlive, viewGroup, false);
        return new ViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        setRecyclerViewHeight();

//        Glide.with(mContext)
//                .load("http://106.15.226.123:8080/photos/img1.jpg")
//                .into(viewHolder.ivIcon);

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    /**
     * 1、获取ItemView的高度
     * 2、ItemView的数量
     * 3、使用itemViewHeight * itemViewNum = RecyclerView 的高度
     */
    private void setRecyclerViewHeight () {

        if(isCalcaulationRyHeight || mRv == null) return;

        isCalcaulationRyHeight = true;

        //  获取ItemView的高度
        RecyclerView.LayoutParams itemViewLP = (RecyclerView.LayoutParams) mItemView.getLayoutParams();
        //  itemView 的数量
        int itemCount = getItemCount();
        //  使用itemViewHeight * itemViewNum = RecyclerView 的高度
        int recyclerViewHeight = itemViewLP.height * itemCount;
        // 设置RecyclerView的高度
        LinearLayout.LayoutParams rvLP = (LinearLayout.LayoutParams) mRv.getLayoutParams();
        rvLP.height = recyclerViewHeight;
        mRv.setLayoutParams(rvLP);

    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivIcon = itemView.findViewById(R.id.iv_icon);
        }
    }
}
