package cinema.project.service;

import java.util.Optional;
import cinema.project.model.User;

public interface UserService {
    User add(User user);

    Optional<User> findByEmail(String email);
}
