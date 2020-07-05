package fra.esgi.twitter.entities;

import javax.persistence.*;

@Entity
@Table(name="FOLLOW")
public class Follow {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    public Long id;

    @Column(name="who_am_i")
    public int whoAmI;

    @Column(name="follow_id")
    public int followId;

    public Follow(){
    }

    public Long getId() {
        return this.id;
    }

    public int getFollowId() {
        return this.followId;
    }

    public int getWhoAmI() {
        return this.whoAmI;
    }

    public void setFollowId(int followId) {
        this.followId = followId;
    }

    public void setWhoAmI(int whoAmI) {
        this.whoAmI = whoAmI;
    }
}
