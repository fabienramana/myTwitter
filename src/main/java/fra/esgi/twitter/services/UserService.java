package fra.esgi.twitter.services;

import fra.esgi.twitter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import fra.esgi.twitter.entities.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String register(User user, HttpServletResponse response){
        userRepository.save(user);
        Cookie cookie = new Cookie("userId", user.getUserId().toString());
        response.addCookie(cookie);
        return "{\"authorid\":" + user.getUserId() +"}"; // retourner le user
        // Faire session
    }

    public String login(String login, HttpServletResponse response){
        Optional<User> u = userRepository.findByLogin(login);
        Cookie cookie = new Cookie("userId", u.get().getUserId().toString());
        response.addCookie(cookie);
        return "{\"authorid\":" + u.get().getUserId() +"}";
    }
}
