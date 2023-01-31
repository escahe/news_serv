package com.escahe.news_serv.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.escahe.news_serv.model.News;

@Controller
@RequestMapping("/news")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET})
public class NewsController {
    
    RestTemplate restTemplate = new RestTemplate();
    @GetMapping("/top-headlines")
    public ResponseEntity<News> getNews() {
        News news = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=co&apiKey=60d9f99982764dd4bcef1672ab828062", News.class);
        System.out.println("se consultó Api");
        return ResponseEntity.ok().body(news);
    }
}
