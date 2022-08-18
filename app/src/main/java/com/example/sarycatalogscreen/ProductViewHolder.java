package com.example.sarycatalogscreen;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sarycatalogscreen.catalogResponse.catalogModels.Datum;

import java.time.temporal.Temporal;

public class ProductViewHolder extends RecyclerView.ViewHolder{

    private ImageView productImg;
    private TextView productName;


    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        productImg = itemView.findViewById(R.id.product_img);
        productName = itemView.findViewById(R.id.product_name);
    }

    public void populateProduct(Datum product, Context context){
        Glide.with(context).load(product.getImage()).into(productImg);
    }

}
