package com.example.sarycatalogscreen;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.temporal.Temporal;

public class ProductViewHolder extends RecyclerView.ViewHolder{

    private ImageView productImg;
    private TextView productName;


    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        productImg = itemView.findViewById(R.id.product_img);
        productName = itemView.findViewById(R.id.product_name);
    }

    public void populateProduct(Product product){
        productImg.setImageResource(product.getImgRes());
        productName.setText(product.getName());
    }

}
