package com.example.songr.controller;

import com.example.songr.Models.Albums;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @GetMapping("/")
    public String getHome(){
        return "index.html";
    }
    @GetMapping("/hello")
    @ResponseBody
    public String getHello(){
        return "hello world";
    }
    @GetMapping("capitalize/{word}")
    public String getCapitalize(@PathVariable("word") String word, Model model){
        model.addAttribute("word",word.toUpperCase());
        return "capitalize.html";
    }
//    @GetMapping("/albums")
//    public String getAlbums(Model model){
//        List <Albums>albums= new ArrayList<>();
//        albums.add(new Albums("Adele21","Adele",5,2880,"https://upload.wikimedia.org/wikipedia/en/1/1b/Adele_-_21.png"));
//        albums.add(new Albums("Hateer Mn Jedeed","Hamza Alnemra",9,2252,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSP-gYSIduOcWdED7kVlZdW8O-QBosZ0XtVvJq1_3wjjqqgYQv2urItPHUm7f-ydIiKkSQ&usqp=CAU"));
//        albums.add(new Albums("Perception","NF",5,3700,"https://upload.wikimedia.org/wikipedia/en/b/bf/Nf_perception_album_cover.jpg"));
//        model.addAttribute("albums",albums);
//        return "albums.html";
//
//    }
}

