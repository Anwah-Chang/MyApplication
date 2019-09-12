package com.dizan.mlicxapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dizan.mlicxapp.R;

public class OnliveGridAdapter extends RecyclerView.Adapter<OnliveGridAdapter.ViewHolder> {

    private Context mContext;

    public OnliveGridAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_grid_onlive, viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Glide.with(mContext)
                .load("http://www.anwahh.xyz:8080/photos/img1.jpg")
                .into(viewHolder.ivIcon);

    }

    @Override
    public int getItemCount() {
        return 9;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivIcon = itemView.findViewById(R.id.iv_icon);
        }
    }
}
