package com.example.songr.controller;

import com.example.songr.Models.Albums;
import com.example.songr.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String albums (Model model){
        List<Albums> albums = (List<Albums>) albumRepository.findAll();
        model.addAttribute("albums",albums);
        return "albums";
    }
    @GetMapping("/addAlbum")
    public String viewAddAlbumForm(){
        return "addAlbum";
    }

//    @PostMapping("/addAlbum")
//    public RedirectView addAlbum(@RequestBody MultiValueMap<String, String> fromData){
//        Albums newAlbum = new Albums(fromData.get("title").get(0),fromData.get("artist").get(0),fromData.get("songCount"),fromData.get("length").get(0),fromData.get("imageUrl").get(0));
//
//        albumRepository.save(newAlbum);
//        return  new RedirectView("/albums");
//    }

    @PostMapping("/addAlbum")
    public RedirectView addAlbum(Model model,
                                 @RequestParam(value="title") String title,
                                 @RequestParam(value="artist") String artist,
                                 @RequestParam(value="songCount") int songCount,
                                 @RequestParam(value="length") int length,
                                 @RequestParam(value="imageUrl") String imageUrl){
        Albums newAlbum = new Albums(title,artist,songCount,length,imageUrl);

        albumRepository.save(newAlbum);
        return  new RedirectView("/albums");
    }




}
