package com.example.sarycatalogscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BannersAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<String> banners;

    public void setBanners(List<String> banners) {
        this.banners = banners;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner_viewpager_item,parent,false);
        return new BannerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return banners.size();
    }
}
