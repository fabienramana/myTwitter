package fra.esgi.twitter;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TwitterController {
    PostService service;
    public TwitterController(PostService service) {
        super();
        this.service = service;
    }
    @GetMapping("")
    public TweetIdDTO helloWorld() {
        return TweetIdDTO.create(32);
    }
    @PostMapping("post")
    public TweetIdDTO post(@RequestBody PostDTO post){
        return service.post(post);
    }
    @GetMapping("/post/{id}")
    public PostDTO getPost(@PathVariable int id){
        return service.getPost(id);
    }
    @GetMapping("/historique/{authorid}")
    public List<PostDTO> getHistorique(@PathVariable int authorid) { return service.getHistorique(authorid); }
    @PostMapping("/register")
    public String register(@RequestBody RegisterForm user) { return service.register(user.login); }
    @PostMapping("/follow/{followid}")
    public String follow(@RequestBody FollowForm user,@PathVariable int followid){ return service.follow(user.whoami, followid); }
    @GetMapping("/timeline/{authorid}")
    public List<PostDTO> getTimeline(@PathVariable int authorid) { return service.getTimeline(authorid); }

}