package com.example.springthymeleaffragmenet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Articles {
    private int id ;
    private String description;
    private Authors authors;
}
