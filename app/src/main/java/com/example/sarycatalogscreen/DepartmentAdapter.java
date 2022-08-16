package com.example.sarycatalogscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentViewHolder> {

    List<Product> departments;

    public DepartmentAdapter(List<Product> departments) {
        this.departments = departments;
    }

    @NonNull
    @Override
    public DepartmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.department_viewholder, parent, false);
        return new DepartmentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DepartmentViewHolder holder, int position) {
        Product currentDepartment = departments.get(position);
        holder.populateDepartment(currentDepartment);
    }

    @Override
    public int getItemCount() {
        return departments.size();
    }
}
