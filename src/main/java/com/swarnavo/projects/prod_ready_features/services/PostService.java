package com.swarnavo.projects.prod_ready_features.services;

import com.swarnavo.projects.prod_ready_features.dto.PostDTO;

import java.util.List;

public interface PostService {
    List<PostDTO> getAllPosts();

    PostDTO createPost(PostDTO inputPost);
}
