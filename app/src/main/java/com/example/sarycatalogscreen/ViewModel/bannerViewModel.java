package com.example.sarycatalogscreen.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.sarycatalogscreen.Repository.CatalogRepository;
import com.example.sarycatalogscreen.Repository.bannerRepository;
import com.example.sarycatalogscreen.bannerResponse.bannerResponse;
import com.example.sarycatalogscreen.catalogResponse.CatalogResponse;

public class bannerViewModel extends ViewModel {


    // this class is used for ViewModel
    private final bannerRepository BannerRepository;


    public bannerViewModel() {

        BannerRepository=  bannerRepository.getInstance();


    }


    public LiveData<bannerResponse> getbanners(){
        return BannerRepository.getData();
    }

    //call MoviesAPI in view-model
   public void CallBannerAPI(){

       BannerRepository.bannerAPI();
    }


}
