package fra.esgi.twitter;

public class Post {
    final int postId;
    final int authorid;
    final String message;
    final int origin;

    public Post(int postId, int authorid, String message, int origin) {
        super();
        this.postId = postId;
        this.authorid = authorid;
        this.message = message;
        this.origin = origin;
    }
}
