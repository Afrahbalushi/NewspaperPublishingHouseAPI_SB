package com.example.NewspaperPublishingHouseAPI.Controller;

import com.example.NewspaperPublishingHouseAPI.Controllers.ArticlesController;
import com.example.NewspaperPublishingHouseAPI.Models.Articles;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArticlesTestController {
    @Autowired
    ArticlesController articlesController;

    @Test
    void getArticleTitle() throws Exception{
        Articles articlesTest = new Articles();
        String title = articlesTest.getTitle();
        assertEquals("New Movie Launching Soon",title);
    }

    @Test
    void getArticleById() throws Exception{
        Articles test = articlesController.getArticleById(1);
        String author = test.getAuthor();
        assertEquals("John Doe", author);
    }
}
