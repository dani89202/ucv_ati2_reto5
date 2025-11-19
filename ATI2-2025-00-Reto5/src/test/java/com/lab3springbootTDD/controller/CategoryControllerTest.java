package com.lab3springbootTDD.controller;

import com.lab3springbootTDD.model.Category;
import com.lab3springbootTDD.service.CategoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CategoryControllerTest {

    @Mock
    CategoryService categoryService;

    @InjectMocks
    CategoryController sut;

    ArrayList<Category> mockCategories;

    @BeforeEach
    void setUp() {
        mockCategories = new ArrayList<>();
        mockCategories.add(new Category(1L, "Category 1", "Description 1"));
        mockCategories.add(new Category(2L, "Category 2", "Description 2"));
        mockCategories.add(new Category(3L, "Category 3", "Description 3"));
    }

    @Test
    void whenGetAllCategories_shouldReturnListOfCategories_withIdNameDescription() {

        when(categoryService.getAll()).thenReturn(mockCategories);

        ArrayList<Category> result = sut.getAllCategories();

        assertEquals(mockCategories.size(), result.size());

        for (int i = 0; i < result.size(); i++) {
            assertEquals(mockCategories.get(i).getId(), result.get(i).getId());
            assertEquals(mockCategories.get(i).getName(), result.get(i).getName());
            assertEquals(mockCategories.get(i).getDescription(), result.get(i).getDescription());
        }
    }
}