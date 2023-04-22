package com.example.springthymeleaffragmenet.service.serviceImpl;

import com.example.springthymeleaffragmenet.model.Authors;
import com.example.springthymeleaffragmenet.repository.AuthorRepository;
import com.example.springthymeleaffragmenet.service.Authorsinterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorImpl implements Authorsinterface {

    AuthorRepository authorRepository;

    AuthorImpl(){ authorRepository = new AuthorRepository();}
    @Override
    public List<Authors> getAllAuthor() {
        return authorRepository.getAllAuthor();
    }
}
