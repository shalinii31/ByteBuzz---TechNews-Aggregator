package com.news.technews_aggregator.controller;

import com.news.technews_aggregator.service.NewsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/news")
    public String getNews() {
        return newsService.getTechNews();
    }
}
