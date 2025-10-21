package com.swarnavo.projects.prod_ready_features.services;

import com.swarnavo.projects.prod_ready_features.dto.PostDTO;
import com.swarnavo.projects.prod_ready_features.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<PostDTO> getAllPosts() {
        return List.of();
    }

    @Override
    public PostDTO createPost(PostDTO inputPost) {
        return null;
    }
}
