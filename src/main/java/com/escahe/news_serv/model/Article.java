package com.escahe.news_serv.model;

import java.util.Objects;

import lombok.Data;

@Data
public class Article {
    private String title, urlToImage,url;
    public void setUrlToImage(String imgUrl) {
        String defaultImg = "https://www.maxpixel.net/static/photo/1x/Headlines-Newsletter-Paper-News-Read-Information-97862.png";
        this.urlToImage = Objects.isNull(imgUrl)?defaultImg:imgUrl;
    }
    
}
