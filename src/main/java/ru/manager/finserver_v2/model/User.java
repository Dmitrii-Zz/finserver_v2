package ru.manager.finserver_v2.model;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, length = 50)
    private String name;
}
