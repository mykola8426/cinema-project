package cinema.project.config;

import cinema.project.model.Role;
import cinema.project.model.User;
import cinema.project.service.RoleService;
import cinema.project.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role admin = new Role();
        admin.setRoleName(Role.RoleName.ADMIN);
        roleService.add(admin);
        Role user = new Role();
        user.setRoleName(Role.RoleName.USER);
        roleService.add(user);

        User manager = new User();
        manager.setEmail("manager@gmail.com");
        manager.setPassword("12345");
        manager.setRoles(Set.of(admin));

        User bob = new User();
        bob.setEmail("bob@i.ua");
        bob.setPassword("12345");
        bob.setRoles(Set.of(user));
        userService.add(manager);
        userService.add(bob);
    }
}
