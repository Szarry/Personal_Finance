package pl.mikolaj.personalfinance.DAO.income;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import pl.mikolaj.personalfinance.DAO.User.AppUser;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private BigDecimal amount;
    private String typeOfIncome;
    private String description;
    private String updatedBy;
    private LocalDateTime date;

    @ManyToOne
    private AppUser user;
}
