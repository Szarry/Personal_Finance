package pl.mikolaj.personalfinance.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mikolaj.personalfinance.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {
}
