package com.example.springthymeleaffragmenet.service;

import com.example.springthymeleaffragmenet.model.Articles;

import java.util.List;

public interface Articlesinterface {
    List<Articles> getAllArticle();

    Articles getArticleById(int id);
    List<Articles> getArticleByName(String name);
}
