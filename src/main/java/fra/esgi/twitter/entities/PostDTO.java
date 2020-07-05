package fra.esgi.twitter.entities;

import java.sql.Timestamp;

public class PostDTO {
    public Long tweetId;
    public int authorid;
    public String message;
    public int origin;
    public Timestamp created_At;


    public PostDTO(Long tweetId, int authorid, String message, int origin, Timestamp created_At){
        this.tweetId = tweetId;
        this.authorid = authorid;
        this.message = message;
        this.origin = origin;
        this.created_At = created_At;
    }
}
