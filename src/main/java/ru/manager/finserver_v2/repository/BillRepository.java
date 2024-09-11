package ru.manager.finserver_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.manager.finserver_v2.model.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
