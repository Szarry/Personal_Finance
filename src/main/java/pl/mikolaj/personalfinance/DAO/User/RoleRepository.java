package pl.mikolaj.personalfinance.DAO.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository <Role, Integer> {

    Role findByName(String name);
}
