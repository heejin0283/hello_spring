package GDGoC_study.hello_spring.Controller;

import GDGoC_study.hello_spring.model.Post;
import GDGoC_study.hello_spring.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post createPost(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "content") String content) {

        return postService.createPost(title, content);
    }
}