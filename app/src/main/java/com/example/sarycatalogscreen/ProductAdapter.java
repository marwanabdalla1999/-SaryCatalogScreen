package com.example.sarycatalogscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.*;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sarycatalogscreen.catalogResponse.catalogModels.Datum;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    List<Datum> products;

    public ProductAdapter(List<Datum> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_viewholder, parent, false);
        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Datum currentProduct = products.get(position);
        holder.populateProduct(currentProduct,holder.itemView.getContext());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
