package GDGoC_study.hello_spring.service;

import GDGoC_study.hello_spring.model.Post;
import GDGoC_study.hello_spring.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(String title, String content) {
        Post post = new Post(title, content);
        return postRepository.save(post);
    }
}