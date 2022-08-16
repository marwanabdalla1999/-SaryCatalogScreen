package com.example.sarycatalogscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.*;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toolbar;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    RecyclerView productRecycler, departmentRecylcer;
    Toolbar upperToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewsById();
        setUpSpinner();

        List<Product> products = createProductList();
        List<Product> departments = createDepartmentList();
        ProductAdapter productAdapter = new ProductAdapter(products);
        DepartmentAdapter departmentAdapter = new DepartmentAdapter(departments);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false);
        GridLayoutManager gridLayoutManagerDep = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        productRecycler.setAdapter(productAdapter);
        productRecycler.setLayoutManager(gridLayoutManager);
        departmentRecylcer.setAdapter(departmentAdapter);
        departmentRecylcer.setLayoutManager(gridLayoutManagerDep);

    }

    private void findViewsById(){
        spinner = findViewById(R.id.location_spinner);
        productRecycler = findViewById(R.id.product_recycler);
        departmentRecylcer = findViewById(R.id.department_recycler);
        upperToolbar = findViewById(R.id.upper_toolbar);
    }

    private void setUpSpinner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.locations,
                R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    private List<Product> createProductList(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        return products;
    }

    private List<Product> createDepartmentList(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));

        return products;
    }
}