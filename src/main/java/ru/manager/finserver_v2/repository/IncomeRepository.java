package ru.manager.finserver_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.manager.finserver_v2.model.Income;

import java.util.Optional;

public interface IncomeRepository extends JpaRepository<Income, Long> {
    Optional<Income> findByIncomeIdAndOwnerUserId(long incomeId, long userId);
}
