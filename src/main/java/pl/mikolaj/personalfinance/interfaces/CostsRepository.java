package pl.mikolaj.personalfinance.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mikolaj.personalfinance.entity.Costs;

public interface CostsRepository extends JpaRepository <Costs, Long> {
}
