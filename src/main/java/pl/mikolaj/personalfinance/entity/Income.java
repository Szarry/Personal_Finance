package pl.mikolaj.personalfinance.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.mikolaj.personalfinance.User.AppUser;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private BigDecimal income;
    private String type_Of_Income;

    @ManyToOne
    private AppUser user;
}
