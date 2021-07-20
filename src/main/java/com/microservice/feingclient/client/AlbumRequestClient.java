package com.microservice.feingclient.client;

import com.microservice.feingclient.model.Album;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url="http://jsonplaceholder.typicode.com", name="album-service")
public interface AlbumRequestClient {

    @GetMapping("/albums")
    public List<Album> getAlbums();

}
