package fra.esgi.twitter.services;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

import fra.esgi.twitter.entities.Follow;
import fra.esgi.twitter.entities.Post;
import fra.esgi.twitter.entities.PostDTO;
import fra.esgi.twitter.repositories.FollowRepository;
import fra.esgi.twitter.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import static java.time.LocalDateTime.*;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private FollowRepository followRepository;


    public String post(int userId, Post post) throws Exception {
        post.setAuthorid(userId);
        Date date = new Date();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        post.setCreatedAt(timestamp);
        if(post.getMessage().isEmpty()){
            throw new Exception("message shouldn't be empty");
        }
        postRepository.save(post);
        return "{\"tweetid\":" + post.getPostId() +"}";
    }

    public PostDTO getPost(Long id) {
        Optional<Post> opost = postRepository.findById(id);
        PostDTO postDTO = new PostDTO(opost.get().getPostId(), opost.get().getAuthorid(), opost.get().getMessage(), opost.get().getOrigin(), opost.get().getCreatedAt());
        return postDTO;
    }


    public List<PostDTO> getHistorique(int authorid){
            List<Optional<Post>> oposts = postRepository.findByAuthorid(authorid);
            List<PostDTO> list = new ArrayList<>();
            for(Optional<Post> opost : oposts){
                PostDTO postDTO = new PostDTO(opost.get().getPostId(), opost.get().getAuthorid(), opost.get().getMessage(), opost.get().getOrigin(), opost.get().getCreatedAt());
                list.add(postDTO);
            }
            return list;
    }

    public List<PostDTO> getTimeline(int userId) {
        List<Optional<Follow>> ofollows = followRepository.findBywhoAmI(userId);
        List<Integer> authors = new ArrayList<>();
        for(Optional<Follow> ofollow : ofollows){
            authors.add(ofollow.get().getFollowId());
        }
        Set<Integer> set = new HashSet<Integer>(authors);
        List<Optional<Post>> allposts = new ArrayList<>();
        List<Optional<Post>> oposts = new ArrayList<>();
        for(Integer id : authors){
            oposts = postRepository.findByAuthorid(id);
            allposts.addAll(oposts);
        }
        List<PostDTO> list = new ArrayList<>();
        for(Optional<Post> opost : allposts){
            PostDTO postDTO = new PostDTO(opost.get().getPostId(), opost.get().getAuthorid(), opost.get().getMessage(), opost.get().getOrigin(), opost.get().getCreatedAt());
            list.add(postDTO);
        }
        return list;
    }
}
