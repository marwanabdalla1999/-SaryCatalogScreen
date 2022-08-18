package com.example.sarycatalogscreen.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.sarycatalogscreen.Repository.CatalogRepository;
import com.example.sarycatalogscreen.catalogResponse.CatalogResponse;

import java.util.List;

public class CatalogViewModel extends ViewModel {


    // this class is used for ViewModel
    private final CatalogRepository catalogRepository;


    public CatalogViewModel() {

        catalogRepository=  CatalogRepository.getInstance();


    }


    public LiveData<CatalogResponse> getCatalog(){
        return catalogRepository.getData();
    }

    //call MoviesAPI in view-model
   public void CallCatalog(){

       catalogRepository.CatalogAPI();
    }


}
