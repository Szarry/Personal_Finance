package pl.mikolaj.personalfinance.DAO.User;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.mikolaj.personalfinance.role.Role;
import pl.mikolaj.personalfinance.role.RoleRepository;

import java.util.Arrays;
import java.util.HashSet;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
                           BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public AppUser findByUserName(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public AppUser findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


    @Override
    public void saveUser(AppUser appUser) {
        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        appUser.setEnabled(1);
        Role userRole = roleRepository.findByName("ROLE_ADMIN");
        appUser.setRoles(new HashSet<>(Arrays.asList(userRole)));
        userRepository.save(appUser);
    }
}
