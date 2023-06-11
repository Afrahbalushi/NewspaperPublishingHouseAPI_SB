package com.example.NewspaperPublishingHouseAPI.Services;

import com.example.NewspaperPublishingHouseAPI.Models.Articles;
import com.example.NewspaperPublishingHouseAPI.Repositories.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesService {
    @Autowired
    ArticlesRepository articlesRepository;

    public Articles getArticleById(Integer id){
        Articles articles = articlesRepository.getArticlesById(id);
        return articles;
    }

    public List<Articles> getAllArticles(){
        return articlesRepository.getAllArticles();
    }

}
