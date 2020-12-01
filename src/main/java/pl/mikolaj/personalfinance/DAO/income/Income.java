package pl.mikolaj.personalfinance.DAO.income;


import lombok.*;
import pl.mikolaj.personalfinance.DAO.User.AppUser;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private BigDecimal income;
    private String type_Of_Income;
    private String description;
    private String updatedBy;

    @ManyToOne
    private AppUser user;
}
