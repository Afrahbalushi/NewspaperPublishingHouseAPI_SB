package com.example.NewspaperPublishingHouseAPI.Repositories;

import com.example.NewspaperPublishingHouseAPI.Models.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends JpaRepository<Articles,Integer> {

}
