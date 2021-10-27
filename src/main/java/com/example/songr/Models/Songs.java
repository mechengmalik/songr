package com.example.songr.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Songs {
    @Id
   private int id;
    private String title;
    private int length;
    private int trackNumber;
    @ManyToOne()
    private Albums albums;

    public Songs(String title, int length, int trackNumber) {

        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }
    public Songs(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Albums getAlbums() {
        return albums;
    }

    public void setAlbums(Albums albums) {
        this.albums = albums;
    }
}
