package pl.mikolaj.personalfinance.DAO.User;

public interface UserService {

    AppUser findByUserName(String name);
    AppUser findByEmail(String email);

    void saveUser(AppUser appUser);
}
