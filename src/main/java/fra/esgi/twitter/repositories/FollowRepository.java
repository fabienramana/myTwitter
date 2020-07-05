package fra.esgi.twitter.repositories;

import fra.esgi.twitter.entities.Follow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FollowRepository extends CrudRepository<Follow, Long> {
    public List<Optional<Follow>> findBywhoAmI(int whoAmI);
}
