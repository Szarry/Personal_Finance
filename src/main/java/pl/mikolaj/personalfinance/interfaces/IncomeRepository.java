package pl.mikolaj.personalfinance.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mikolaj.personalfinance.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, Integer> {
}
