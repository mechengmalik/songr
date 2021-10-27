package com.example.songr.Repository;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository<Song> extends CrudRepository<Song,Integer> {

}
