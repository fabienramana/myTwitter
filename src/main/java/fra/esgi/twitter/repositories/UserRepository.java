package fra.esgi.twitter.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import fra.esgi.twitter.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    public Optional<User> findByLogin(String login);
}

