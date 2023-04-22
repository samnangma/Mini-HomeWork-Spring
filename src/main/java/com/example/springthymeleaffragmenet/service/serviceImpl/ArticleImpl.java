package com.example.springthymeleaffragmenet.service.serviceImpl;

import com.example.springthymeleaffragmenet.model.Articles;
import com.example.springthymeleaffragmenet.repository.ArticleRepository;
import com.example.springthymeleaffragmenet.service.Articlesinterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleImpl implements Articlesinterface {
    ArticleRepository articleRepository;

    ArticleImpl() {articleRepository = new ArticleRepository();}
    @Override
    public List<Articles> getAllArticle() {
        return articleRepository.getArticles();
    }

    @Override
    public Articles getArticleById(int id) {
        return articleRepository.getArticleByid(id);
    }

    @Override
    public List<Articles> getArticleByName(String name) {
        return articleRepository.getArticleByAuthorName(name);
    }
}
