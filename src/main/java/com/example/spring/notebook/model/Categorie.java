package com.example.spring.notebook.model;

public class Categorie {
    private int id;
    private String categorieName;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategorieName() {
        return categorieName;
    }

    public void setCategorieName(String categorieName) {
        this.categorieName = categorieName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
