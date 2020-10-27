package com.example.myapplication;


import android.graphics.Bitmap;

public class Pokemon {

    private String name;
    private String id;
    private String image;

    public Pokemon(String name, String id, String image) {
        this.name = name;
        this.id = id;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public String getImage() {
        return image;
    }
}
