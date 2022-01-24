package com.project.resources;

import java.util.ArrayList;
import java.util.List;

import com.project.entities.Category;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @GetMapping
    public ResponseEntity<List<Category>> list() {
        List<Category> allCategories = new ArrayList<>();
        allCategories.add(new Category(1L, "Games"));
        allCategories.add(new Category(2L, "Office"));
        return ResponseEntity.ok().body(allCategories);
    }
}
