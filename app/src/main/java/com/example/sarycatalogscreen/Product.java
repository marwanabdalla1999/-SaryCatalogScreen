package com.example.sarycatalogscreen;

public class Product {
    private final String name;
    private final int imgRes;


    public Product(String name, int imgRes) {
        this.name = name;
        this.imgRes = imgRes;
    }

    public String getName() {
        return name;
    }

    public int getImgRes() {
        return imgRes;
    }
}
