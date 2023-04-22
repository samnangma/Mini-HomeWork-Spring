package com.example.springthymeleaffragmenet.repository;

import com.example.springthymeleaffragmenet.model.Authors;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class AuthorRepository {
    List<Authors> authors = new ArrayList<>(){{
        add(new Authors(100, "Nara", "https://cdn.dribbble.com/users/383277/screenshots/18055765/media/e5fc935b60035305099554810357012a.png?compress=1&resize=400x300",  "Nara the happy man and enjoy his life ", "male", "Dara21@gmail.com", "phnomPenh", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.newyorker.com%2Fculture%2Finfinite-scroll%2Fwhy-bored-ape-avatars-are-taking-over-twitter&psig=AOvVaw2TRPp0ees5pmzdr8r2gTMV&ust=1682225911292000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKjlyYHavP4CFQAAAAAdAAAAABAJ"));
        add(new Authors(101, "Dara", "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/robert-pattinson-as-batman-bruce-wayne-in-the-batman-1645186686.jpeg?crop=0.607xw:0.911xh;0.318xw,0.0102xh&resize=640:*" ,"male", "male", "LOL.org@gmail.com", "Cambodia", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT098Y1nol2LW3PghwXKtfpRJR8nIc39IfUcBDTgniZcAFvsk-W96vl6rcZas322V5hiSA&usqp=CAU"));
        add(new Authors(102, "Captain Marvel","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.giantfreakinrobot.com%2Fent%2Fexclusive-brie-larson-captain-marvel.html&psig=AOvVaw26myIeKq_Hk-mjf4bJzQQR&ust=1682227509670000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCNjf-PrfvP4CFQAAAAAdAAAAABAE" ,  "Female", "male", "Nang.Hashaa@gmail.com", "Phnom Penh", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwallpaperset.com%2Fhd-marvel-wallpapers&psig=AOvVaw0vCBHjoo7vR9En_604lL6z&ust=1682227424057000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPiGntLfvP4CFQAAAAAdAAAAABAJ"));


    }};
    public List<Authors> getAllAuthor(){
        return authors;
    }

}
