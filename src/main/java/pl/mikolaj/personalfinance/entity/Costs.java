package pl.mikolaj.personalfinance.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
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
    private User user;


}
