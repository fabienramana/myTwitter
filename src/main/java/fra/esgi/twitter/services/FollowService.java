package fra.esgi.twitter.services;

import fra.esgi.twitter.entities.Follow;
import fra.esgi.twitter.repositories.FollowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowService {
    @Autowired
    private FollowRepository followRepository;

    public String follow(int userId, int followid){
        Follow f= new Follow();
        f.setFollowId(followid);
        f.setWhoAmI(userId);

        followRepository.save(f);
        return "{\"follow_id\":"+ f.getId() +"}";
    }
}
