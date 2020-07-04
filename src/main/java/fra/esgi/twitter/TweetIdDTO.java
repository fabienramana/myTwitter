package fra.esgi.twitter;

public class TweetIdDTO {

    public int tweetid;

    public static TweetIdDTO create (int tweetid) {
        TweetIdDTO res = new TweetIdDTO();
        res.tweetid = tweetid;
        return res;
    }
}
