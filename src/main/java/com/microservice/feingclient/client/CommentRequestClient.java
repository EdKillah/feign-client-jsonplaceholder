package com.microservice.feingclient.client;


import com.microservice.feingclient.model.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url="http://jsonplaceholder.typicode.com", name="comment-service")
public interface CommentRequestClient {

    @GetMapping("/comments")
    public List<Comment> getComments();
}
