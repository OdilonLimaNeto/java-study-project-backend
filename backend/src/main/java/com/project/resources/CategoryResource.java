package com.project.resources;

import java.util.List;

import com.project.entities.Category;
import com.project.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> list() {
        List<Category> allCategories = service.geAlltCategories();
        return ResponseEntity.ok().body(allCategories);
    }
}
