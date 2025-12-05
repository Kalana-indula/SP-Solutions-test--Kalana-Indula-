package com.example.demo.service;

import com.example.demo.dto.response.ListResponse;
import com.example.demo.entity.NewsCategory;
import org.springframework.stereotype.Service;

@Service
public interface NewsCategoryService {

    //add a new category
    NewsCategory addNewsCategory(NewsCategory newsCategory);

    //get all news categories
    ListResponse getAllNewsCategories();

    NewsCategory getNewsCategoryById(Long id);
}
