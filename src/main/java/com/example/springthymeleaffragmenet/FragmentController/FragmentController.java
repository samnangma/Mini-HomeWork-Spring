package com.example.springthymeleaffragmenet.FragmentController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

//Calling fragment using fragment expression
@Controller
public class FragmentController {
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
        List <String> userNames = new ArrayList<>(){{
            add("James");
            add("hashaa");
            add("joe");
            add("Nana");
        }};
        model.addAttribute("users",userNames);
        return "alluser";
    }

}
