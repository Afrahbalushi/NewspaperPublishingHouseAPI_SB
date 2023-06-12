package com.example.NewspaperPublishingHouseAPI.Repositories;

import com.example.NewspaperPublishingHouseAPI.Models.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository

public interface ArticlesRepository  extends JpaRepository<Articles,Integer>{

    @Query(value = "Select a From Articles a Where a.id = :articleId")
    Articles getArticlesById(@Param("articleId") Integer id);

    @Query(value = "Select a From Articles a")
    List<Articles> getAllArticles();

}
