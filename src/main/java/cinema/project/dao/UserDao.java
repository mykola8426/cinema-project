package cinema.project.dao;

import java.util.Optional;
import cinema.project.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> findByEmail(String email);
}
