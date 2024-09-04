package ru.manager.finserver_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.manager.finserver_v2.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
