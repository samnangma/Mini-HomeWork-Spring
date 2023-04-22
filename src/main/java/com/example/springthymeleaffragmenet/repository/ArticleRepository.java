package com.example.springthymeleaffragmenet.repository;

import com.example.springthymeleaffragmenet.model.Articles;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ArticleRepository {
    List <Articles> articles = new ArrayList<>(){{
        add(new Articles(100,"DATA LOL",new AuthorRepository().getAllAuthor().get(0)));
        add(new Articles(101,"Spring LOL",new AuthorRepository().getAllAuthor().get(1)));
        add(new Articles(102,"JAVA LOL",new AuthorRepository().getAllAuthor().get(2)));

    }};

    public List<Articles> getArticles(){
        return articles;
    }

    public Articles getArticleByid(int id){
        return articles.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public List<Articles> getArticleByAuthorName(String name){
        return articles.stream().filter(s -> Objects.equals(s.getAuthors().getName(), name)).toList();
    }
}
