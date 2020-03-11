package com.gieandessilva.api.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.gieandessilva.api.domain.Const;
import com.gieandessilva.api.entities.Role;
import com.gieandessilva.api.entities.User;
import com.gieandessilva.api.repositories.RoleRepository;
import com.gieandessilva.api.repositories.UserRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {

        List<User> users = userRepository.findAll();

        if (users.isEmpty()) {
            createUser("Gieandes Silva", "admin", passwordEncoder.encode("123456"), Const.ROLE_ADMIN);
            createUser("Danilo Tiago", "cliente", passwordEncoder.encode("123456"), Const.ROLE_CLIENT);
        }

    }
    
    public void createUser(String name, String email, String password, String roleName) {

        Role role = new Role(roleName);

        this.roleRepository.save(role);
        User user = new User(name, email, password, Arrays.asList(role));
        userRepository.save(user);
    }
}
