package com.example.springthymeleaffragmenet.FragmentController;

import com.example.springthymeleaffragmenet.model.Articles;
import com.example.springthymeleaffragmenet.repository.CategoryRepository;
import com.example.springthymeleaffragmenet.service.serviceImpl.ArticleImpl;
import com.example.springthymeleaffragmenet.service.serviceImpl.AuthorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

//Calling fragment using fragment expression
@Controller
public class FragmentController {
    CategoryRepository categoryRepository;
    ArticleImpl article;

    AuthorImpl author;

    @Autowired
    public FragmentController(CategoryRepository categoryRepository, ArticleImpl article, AuthorImpl author) {
        this.categoryRepository = categoryRepository;
        this.article = article;
        this.author = author;
    }

    @GetMapping("/home")
    String index(){
        return "index";
    }

    @GetMapping("/profile")
    String profile(){
        return "profile";
    }

    @GetMapping("/allusers")
    String allUsers(Model model){
       model.addAttribute("Authors",author.getAllAuthor());
        model.addAttribute("allArticle",article.getAllArticle());
        return "alluser";
    }

}
