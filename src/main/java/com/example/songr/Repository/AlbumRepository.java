package com.example.songr.Repository;

import com.example.songr.Models.Albums;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Albums,Integer> {

}
