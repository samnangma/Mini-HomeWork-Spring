package com.example.springthymeleaffragmenet.service.serviceImpl;

import com.example.springthymeleaffragmenet.model.ListCategory;
import com.example.springthymeleaffragmenet.repository.CategoryRepository;
import com.example.springthymeleaffragmenet.service.Categoryinterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl implements Categoryinterface {
    CategoryRepository categoryRepository;

    ServiceImpl(){categoryRepository = new CategoryRepository(); }
    @Override
    public List<ListCategory> getAllArticle() {
        return categoryRepository.getAllCategory();
    }
}
