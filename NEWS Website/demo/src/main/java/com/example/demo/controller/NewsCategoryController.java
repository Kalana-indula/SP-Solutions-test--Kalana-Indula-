package com.example.demo.controller;

import com.example.demo.dto.response.ListResponse;
import com.example.demo.entity.NewsCategory;
import com.example.demo.service.NewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class NewsCategoryController {

    private NewsCategoryService newsCategoryService;

    @Autowired
    public NewsCategoryController(NewsCategoryService newsCategoryService) {
        this.newsCategoryService = newsCategoryService;
    }

    @PostMapping("/categories")
    public ResponseEntity<?> createNewsCategory(@RequestBody NewsCategory newsCategory) {
        try {
            NewsCategory category = newsCategoryService.addNewsCategory(newsCategory);

            return ResponseEntity.status(HttpStatus.OK).body(category);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }


    @GetMapping("/categories")
    public ResponseEntity<?> findAllCategories() {
        try {
            ListResponse<NewsCategory> response = newsCategoryService.getAllNewsCategories();

            return ResponseEntity.status(HttpStatus.OK).body(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
