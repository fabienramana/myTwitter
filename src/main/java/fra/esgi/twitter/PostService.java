package fra.esgi.twitter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class PostService {
    final AtomicInteger counter = new AtomicInteger();
    final List<Post> posts = new CopyOnWriteArrayList<>();


    public TweetIdDTO post(PostDTO post) {
        int id = counter.getAndIncrement();
        Post p = new Post(id, post.authorid, post.message, post.origin);
        posts.add(p);
        return TweetIdDTO.create(id);
    }

    public PostDTO getPost(int id) {
        return posts.stream()
                .filter(p -> p.postId == id)
                .findAny()
                .map(this::toDTO)
                .orElse(null)
                ;
    }
    public PostDTO toDTO(Post post){
        PostDTO p = new PostDTO();
        p.message = post.message;
        p.authorid = post.authorid;
        p.origin = post.origin;
        p.postId = post.postId;

        return p;
    }

    public List<PostDTO> getHistorique(int authorid){
            return posts.stream()
                    .filter(p -> p.authorid == authorid)
                .map(this::toDTO)
                .collect(Collectors.toList())
                ;
    }

    public String register(String login) {
        return "Login successfully as " + login + "";
    }

    public String follow(int whoami, int followid) {
        return "the user number " + whoami + " is following the number " + followid + "";
    }

    public List<PostDTO> getTimeline(int authorid) {
        return posts.stream()
                .filter(p -> p.authorid == authorid)
                .map(this::toDTO)
                .collect(Collectors.toList())
                ;
    }
}
