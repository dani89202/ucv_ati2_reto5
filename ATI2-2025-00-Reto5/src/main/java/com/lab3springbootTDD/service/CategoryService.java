package com.lab3springbootTDD.service;

import com.lab3springbootTDD.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryService {

    public ArrayList<Category> getAll() {
        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category(1L, "Category 1", "Description 1"));
        categories.add(new Category(2L, "Category 2", "Description 2"));
        categories.add(new Category(3L, "Category 3", "Description 3"));
        return categories;
    }
}
