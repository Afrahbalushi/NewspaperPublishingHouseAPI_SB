package com.example.NewspaperPublishingHouseAPI.Controllers;

import com.example.NewspaperPublishingHouseAPI.Models.Articles;
import com.example.NewspaperPublishingHouseAPI.Services.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@RestController
@RequestMapping(value = "/articles")
public class ArticlesController {

    @Autowired
    ArticlesService articlesService;

    @PostMapping(value = "/createRecord")
    public String articlesRecord(@RequestParam String title, String content, String author, Date publishDate, Boolean isActive) {
        try{
            articlesService.articlesRecord(title,content,author,publishDate,isActive);
        }catch (Exception e){
            return "Fail to create!";
        }
        return "Created!";
    }

        @GetMapping(value = "/getAll")
    public List<Articles> getAllArticles(){
        List<Articles> articles = new ArrayList<>();
        articles = articlesService.getAllArticles();
        return articles;
    }

    @GetMapping(value = "/getById")
    public Articles getArticleById(@RequestParam Integer articleId){
        Articles articles = articlesService.getArticleById(articleId);
        return articles;
    }


    @PutMapping(value = "update")
    public ResponseEntity<String> updateArticle(@RequestParam Integer id, String title, String content, String author, Date publishDate, Boolean isActive){
        String MSG = articlesService.updateArticle(id,title,content,author,publishDate,isActive);
        return ResponseEntity.ok().body(MSG);
    }


    @DeleteMapping(value = "/delete")
    public String deleteArticle(@RequestParam Integer id){
        articlesService.deleteArticle(id);
        return "Record Deleted Successfully!";
    }




}
