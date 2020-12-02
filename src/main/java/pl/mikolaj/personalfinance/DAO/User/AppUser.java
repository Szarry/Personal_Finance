package pl.mikolaj.personalfinance.DAO.User;

import lombok.Data;
import pl.mikolaj.personalfinance.role.Role;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    @Size(min=2, max=10)
    private String username;

    @Column
    @NotEmpty (message = "Podaj imię")
    public String firstname;

    @Column
    @NotEmpty (message = "Podaj Nazwisko")
    public String lastname;

    @Column (unique = true)
    @NotEmpty (message = "Pole nie może być puste")
    @Email
    public String email;

    @NotEmpty (message = "Wprowadź hasło")
    private String password;
    private int enabled;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Role> roles;


}
