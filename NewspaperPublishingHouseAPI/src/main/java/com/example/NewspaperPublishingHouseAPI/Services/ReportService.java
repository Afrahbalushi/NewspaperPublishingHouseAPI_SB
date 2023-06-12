package com.example.NewspaperPublishingHouseAPI.Services;

import com.example.NewspaperPublishingHouseAPI.Models.Articles;
import com.example.NewspaperPublishingHouseAPI.Repositories.ArticlesRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    ArticlesRepository articlesRepository;

    @Autowired
    public static final String path="C:\\Users\\AfrahAlBalushi\\Downloads\\NewspaperPublishingHouseAPI\\NewspaperPublishingHouseAPI";

    public String generateReport() throws FileNotFoundException, JRException{

        List<Articles> articles = articlesRepository.getAllArticles();
        File file = new File("C:\\Users\\AfrahAlBalushi\\Downloads\\NewspaperPublishingHouseAPI\\NewspaperPublishingHouseAPI\\src\\main\\resources\\Report.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(articles);
        Map<String,Object> myMap = new HashMap<>();
        myMap.put("CreatedBy","Afrah");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,myMap,dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\ArticleReport.pdf");
        return "Report Generated!!";
    }


}
