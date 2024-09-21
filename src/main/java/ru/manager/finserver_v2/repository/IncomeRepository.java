package ru.manager.finserver_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.manager.finserver_v2.model.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {
    Income findByIncomeIdAndOwnerUserId(long incomeId, long userId);
}
