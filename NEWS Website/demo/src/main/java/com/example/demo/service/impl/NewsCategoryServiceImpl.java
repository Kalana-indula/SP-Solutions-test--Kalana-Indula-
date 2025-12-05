package com.example.demo.service.impl;

import com.example.demo.dto.response.ListResponse;
import com.example.demo.entity.NewsCategory;
import com.example.demo.repository.NewsCategoryRepository;
import com.example.demo.service.NewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NewsCategoryServiceImpl implements NewsCategoryService {

    private NewsCategoryRepository newsCategoryRepository;

    @Autowired
    public NewsCategoryServiceImpl(NewsCategoryRepository newsCategoryRepository) {
        this.newsCategoryRepository = newsCategoryRepository;
    }

    @Override
    public NewsCategory addNewsCategory(NewsCategory newsCategory) {
        return newsCategoryRepository.save(newsCategory);
    }

    @Override
    public ListResponse<NewsCategory> getAllNewsCategories() {

        //new response
        ListResponse<NewsCategory> response = new ListResponse<>();

        if(newsCategoryRepository.findAll().isEmpty()) {
            response.setMessage("No news categories found");
            return response;
        }

        response.setMessage("All news categories found");
        response.setEntityList(newsCategoryRepository.findAll());

        return response;
    }

    @Override
    public NewsCategory getNewsCategoryById(Long id) {
        return null;
    }
}
