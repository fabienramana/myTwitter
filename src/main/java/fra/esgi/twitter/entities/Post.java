package fra.esgi.twitter.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="POST")
public class Post {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long postId;

    @Column(name="author_id")
    private int authorid;

    @Column(name="message")
    private String message;

    @Column(name="origin")
    private int origin;


    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    public Post() {
    }

    public Long getPostId() {
        return this.postId;
    }

    public int getAuthorid() {
        return this.authorid;
    }

    public int getOrigin() {
        return this.origin;
    }

    public String getMessage() {
        return this.message;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public Timestamp getCreatedAt() { return createdAt; }

    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
}
