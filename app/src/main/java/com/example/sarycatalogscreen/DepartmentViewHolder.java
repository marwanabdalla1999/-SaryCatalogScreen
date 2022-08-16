package com.example.sarycatalogscreen;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DepartmentViewHolder extends RecyclerView.ViewHolder {
    private ImageView depImg;
    private TextView depName;


    public DepartmentViewHolder(@NonNull View itemView) {
        super(itemView);
        depImg = itemView.findViewById(R.id.dep_img);
        depName = itemView.findViewById(R.id.dep_name);
    }

    public void populateDepartment(Product product){
        depImg.setImageResource(product.getImgRes());
        depName.setText(product.getName());
    }

}
