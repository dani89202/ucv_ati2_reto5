package com.lab3springbootTDD.controller;

import com.lab3springbootTDD.model.Category;
import com.lab3springbootTDD.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello";
    }

    @GetMapping(value = "/categories")
    @ResponseBody
    public ArrayList<Category> getAllCategories() {
        return categoryService.getAll();
    }
}