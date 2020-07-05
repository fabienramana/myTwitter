package fra.esgi.twitter.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fra.esgi.twitter.entities.Post;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    public List<Optional<Post>> findByAuthorid(int authorId);
}
