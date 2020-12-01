package pl.mikolaj.personalfinance.DAO.budget;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {

    @Query(value = "INSERT into budget values (1, ?,?) ", nativeQuery = true)
    void saveBudget(BigDecimal budget, LocalDateTime dateTime);

}
