package com.example.myapplication;


public class Pokemon {

    private String name;
    private String id;
    private String miniature;
    private String imageZoom;

    public Pokemon(String name, String id, String miniature, String imageZoom) {
        this.name = name;
        this.id = id;
        this.miniature = miniature;
        this.imageZoom = imageZoom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMiniature(String miniature) {
        this.miniature = miniature;
    }

    public void setImageZoom(String imageZoom) {
        this.imageZoom = imageZoom;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public String getImageZoom() {
        return imageZoom;
    }

    public String getMiniature() {
        return miniature;
    }
}


