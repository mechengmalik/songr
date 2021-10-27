package com.example.songr.controller;

import com.example.songr.Models.Albums;
import com.example.songr.Models.Songs;
import com.example.songr.Repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @Autowired
    CrudRepository albumRepository;
    @GetMapping("/cars")
    public String getAllCars(Model model){
        List<Songs> songs = (ArrayList)songRepository.findAll();
        model.addAttribute("songs", songs);
        return "song.html";
    }

    @GetMapping("/albums/{id}")
    public  String newSong(@PathVariable ("id") int id , Model model){

        model.addAttribute("albums",albumRepository.findById(id).get());
        return ("albumDescription.html");
    }

    @PostMapping("/addsong/{id}")
    public RedirectView addSong(@ModelAttribute Songs songs, @PathVariable("id") int id){
        songs.setAlbums((Albums) albumRepository.findById(id).get());
        songRepository.save(songs);
        return new RedirectView("/albums/{id}");

    }

}
