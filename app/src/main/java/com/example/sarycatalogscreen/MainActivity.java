package com.example.sarycatalogscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.*;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.sarycatalogscreen.ViewModel.CatalogViewModel;
import com.example.sarycatalogscreen.ViewModel.bannerViewModel;
import com.example.sarycatalogscreen.bannerResponse.bannerResponse;
import com.example.sarycatalogscreen.bannerResponse.banners;
import com.example.sarycatalogscreen.postersViewPagerAdapter.postersAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    RecyclerView productRecycler, departmentRecylcer;
    //Toolbar upperToolbar;
        ViewPager2 posters;
    private   List<banners> postersList;
    Timer timer;
    private CatalogViewModel catalogViewModel;
    private bannerViewModel bannerViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewsById();
        setUpSpinner();

        List<Product> products = createProductList();
        List<Product> departments = createDepartmentList();
        DepartmentAdapter departmentAdapter = new DepartmentAdapter(departments);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false);
        GridLayoutManager gridLayoutManagerDep = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);


        productRecycler.setLayoutManager(gridLayoutManager);
        departmentRecylcer.setAdapter(departmentAdapter);
        departmentRecylcer.setLayoutManager(gridLayoutManagerDep);

        CatalogAPI();
        bannerAPI();
        observeAnyChange();
    }

    private void bannerAPI() {
        bannerViewModel=new ViewModelProvider(this).get(bannerViewModel.class);
        bannerViewModel.CallBannerAPI();
    }

    private void findViewsById(){
        spinner = findViewById(R.id.location_spinner);
        productRecycler = findViewById(R.id.product_recycler);
        departmentRecylcer = findViewById(R.id.department_recycler);
        posters=findViewById(R.id.pager);
        //upperToolbar = findViewById(R.id.upper_toolbar);
    }
    private void setupViewPager(bannerResponse catalogModel) {
        postersList=new ArrayList<>();
        for (int i=0;i<catalogModel.getResult().size();i++){
            postersList.add(catalogModel.getResult().get(i));

        }
       //
      //  postersList.add(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.ad2).toString());
      //  postersList.add(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.ad3).toString());
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


    //Call moviesAPI from View-model
    private void CatalogAPI(){
        catalogViewModel=new ViewModelProvider(this).get(CatalogViewModel.class);
        catalogViewModel.CallCatalog();

    }

    //observe any change
    private void observeAnyChange(){
        catalogViewModel.getCatalog().observe(this, catalogModel -> {
            if(catalogModel!=null){
                ProductAdapter productAdapter = new ProductAdapter(catalogModel.getResult().get(3).getData());
                productRecycler.setAdapter(productAdapter);
                productAdapter.notifyDataSetChanged();

            }
        });


        bannerViewModel.getbanners().observe(this, catalogModel -> {
            if(catalogModel!=null){
                setupViewPager(catalogModel);


            }
        });

    }
}