package fra.esgi.twitter;
import fra.esgi.twitter.entities.Post;
import fra.esgi.twitter.entities.PostDTO;
import fra.esgi.twitter.entities.User;
import fra.esgi.twitter.services.FollowService;
import fra.esgi.twitter.services.PostService;
import fra.esgi.twitter.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
public class TwitterController {
    PostService postService;
    UserService userService;
    FollowService followService;
    public TwitterController(PostService postService, UserService userService, FollowService followService) {
        super();
        this.postService = postService;
        this.userService = userService;
        this.followService = followService;
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public String post(@CookieValue(value="userId", defaultValue = "-1") int userId, @RequestBody Post post) throws Exception {
        if(userId == -1){
            throw new Exception("Access Denied");
        }
        return postService.post(userId, post);
    }
    @GetMapping("/post/{id}")
    public PostDTO getPost(@PathVariable Long id){
        return postService.getPost(id);
    }

    @GetMapping("/historique/{authorid}")
    public List<PostDTO> getHistorique(@PathVariable int authorid) { return postService.getHistorique(authorid); }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public String register(@RequestBody User user, HttpServletResponse response) { return userService.register(user, response); }

    @PostMapping("/login")
    public String login(@RequestBody User user, HttpServletResponse response){ return userService.login(user.getLogin(), response);}

    @PostMapping("/follow/{followid}")
    @ResponseStatus(HttpStatus.CREATED)
    public String follow(@CookieValue(value="userId", defaultValue = "-1") int userId, @PathVariable int followid) throws Exception {
        if(userId == -1){
            throw new Exception("Access Denied");
        }
        return followService.follow(userId, followid);
    }

    @GetMapping("/timeline")
    public List<PostDTO> getTimeline(@CookieValue(value="userId", defaultValue = "-1") int userId) throws Exception {
        if(userId == -1){
            throw new Exception("Access Denied");
        }
        return postService.getTimeline(userId); }

}