package pl.mikolaj.personalfinance.DAO.cost;


import lombok.Data;
import pl.mikolaj.personalfinance.DAO.User.AppUser;
import pl.mikolaj.personalfinance.DAO.category.Category;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Costs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal cost;
    private String description;
    private String file_Path;
    private LocalDateTime date_Time;

    @ManyToOne
    private Category category;

    @ManyToOne
    private AppUser user;


}
