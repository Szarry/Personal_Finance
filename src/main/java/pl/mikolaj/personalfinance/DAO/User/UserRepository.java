package pl.mikolaj.personalfinance.DAO.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByEmail(String email);

    AppUser findByUsername(String username);

    AppUser findByEmailAndPassword(String email, String password);
}
