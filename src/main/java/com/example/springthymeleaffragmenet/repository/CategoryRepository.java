package com.example.springthymeleaffragmenet.repository;

import com.example.springthymeleaffragmenet.model.ListCategory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {
    List<ListCategory> categories = new ArrayList<>(){{
        add(new ListCategory("Programming"));
        add(new ListCategory("Sport"));
        add(new ListCategory("Education"));
        add(new ListCategory("Science"));
        add(new ListCategory("Biology"));
    }};

    public List<ListCategory> getAllCategory(){
        return categories;
    }
}
