package com.example.sarycatalogscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.*;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toolbar;

import com.example.sarycatalogscreen.postersViewPagerAdapter.postersAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    RecyclerView productRecycler, departmentRecylcer;
    //Toolbar upperToolbar;
        ViewPager2 posters;
    private   List<String> postersList;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewsById();
        setUpSpinner();
        setupViewPager();
        List<Product> products = createProductList();
        List<Product> departments = createDepartmentList();
        ProductAdapter productAdapter = new ProductAdapter(products);
        DepartmentAdapter departmentAdapter = new DepartmentAdapter(departments);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3,RecyclerView.HORIZONTAL,false);
        GridLayoutManager gridLayoutManagerDep = new GridLayoutManager(this, 2,LinearLayoutManager.HORIZONTAL,false);
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
        posters=findViewById(R.id.pager);
        //upperToolbar = findViewById(R.id.upper_toolbar);
    }
    private void setupViewPager() {
        postersList=new ArrayList<>();
        postersList.add(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.ad1).toString());
        postersList.add(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.ad2).toString());
        postersList.add(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.ad3).toString());
        postersAdapter postersAdapter = new postersAdapter();
        postersAdapter.setPosters(postersList);
        posters.setAdapter(postersAdapter);
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                posters.post(new Runnable(){

                    @Override
                    public void run() {
                        posters.setCurrentItem((posters.getCurrentItem()+1)%postersList.size());
                    }
                });
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 2000, 2000);
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
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));

        return products;
    }

    private List<Product> createDepartmentList(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));
        products.add(new Product("مويه", R.drawable.water));
        products.add(new Product("مشروبات غازية", R.drawable.pepsi));
        products.add(new Product("عصيرات", R.drawable.juice));


        return products;
    }
}