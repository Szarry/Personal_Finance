package pl.mikolaj.personalfinance.DAO.income;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Integer> {

    Income findIncomeById (int id);
    Income findById(int id);
}
