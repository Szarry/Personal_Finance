package pl.mikolaj.personalfinance.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    public AppUser findByEmail(String email);

    AppUser findByUsername(String username);

    public AppUser findByEmailAndPassword(String email, String password);
}
