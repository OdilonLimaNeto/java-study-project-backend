package com.project.services;

import java.util.List;

import com.project.entities.Category;
import com.project.repositories.CategoriesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoriesRepository repository;

    public List<Category> geAlltCategories() {
        return repository.findAll();
    }
}
