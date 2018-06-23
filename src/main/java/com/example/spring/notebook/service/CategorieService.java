package com.example.spring.notebook.service;

import com.example.spring.notebook.db.NotebookRepository;
import com.example.spring.notebook.model.Categorie;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CategorieService {
    private NotebookRepository repository;

    public CategorieService(NotebookRepository repository){
        this.repository = repository;
    }

    public Collection<Categorie> getCategories(){
        return repository.getCategories();
    }
}
