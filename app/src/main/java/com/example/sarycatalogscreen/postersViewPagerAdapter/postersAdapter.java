package com.example.sarycatalogscreen.postersViewPagerAdapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sarycatalogscreen.R;
import com.example.sarycatalogscreen.bannerResponse.banners;

import java.util.List;

public class postersAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    List<banners> posters;

    public void setPosters(List<banners> posters) {
        this.posters = posters;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_pager_item,parent,false);
        return new posterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(holder.itemView.getContext()).load(posters.get(position).getImage()).into(((posterViewHolder)holder).poster);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(holder.itemView.getContext(), posters.get(position).getLink(), Toast.LENGTH_SHORT).show();
                }
            });
    }

    @Override
    public int getItemCount() {
        return posters.size();
    }
}
