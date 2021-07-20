package com.microservice.feingclient.controller;

import com.microservice.feingclient.client.AlbumRequestClient;
import com.microservice.feingclient.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlbumController {

    @Autowired
    private AlbumRequestClient albumClient;

    @GetMapping("/albums")
    public List<Album> getAlbums(){
        return albumClient.getAlbums();
    }
}
