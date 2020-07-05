package fra.esgi.twitter.entities;

import javax.persistence.*;

@Entity
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long userId;

    @Column(name="login")
    private String login;

    public User() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getLogin() {
        return this.login;
    }

    public void setUsername(String login) {
        this.login = login;
    }
}
