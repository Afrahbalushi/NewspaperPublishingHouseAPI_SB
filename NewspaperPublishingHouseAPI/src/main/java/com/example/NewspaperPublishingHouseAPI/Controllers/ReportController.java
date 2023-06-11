package com.example.NewspaperPublishingHouseAPI.Controllers;

import com.example.NewspaperPublishingHouseAPI.Services.ArticlesService;
import com.example.NewspaperPublishingHouseAPI.Services.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping(value = "report")
public class ReportController {
    @Autowired
    ReportService reportService;

    @GetMapping(value = "/getReport")
    public String generateReport() throws FileNotFoundException, JRException{
        return reportService.generateReport();
    }
}
