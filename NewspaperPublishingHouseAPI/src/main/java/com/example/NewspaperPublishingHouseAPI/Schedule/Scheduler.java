package com.example.NewspaperPublishingHouseAPI.Schedule;

import com.example.NewspaperPublishingHouseAPI.Models.Articles;
import com.example.NewspaperPublishingHouseAPI.Repositories.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Component
public class Scheduler {
    @Autowired
    private ArticlesRepository articleRepository;

    @Scheduled(cron = "0 0 0 * * *")
    public void updateArticleStatus() {
      Articles articles = (Articles) articleRepository.getAllArticles();
      if(articles.getIsActive()== Boolean.FALSE && !articles.getPublishDate().equals("2023-01-01")) {
      articles.setIsActive(Boolean.TRUE);
      }
      articleRepository.save(articles);

    }
}
