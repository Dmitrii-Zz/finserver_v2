package ru.manager.finserver_v2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finserver/users")
public class UserController {

    @PostMapping
    public String createUser() {
        return "Создаём пользователя";
    }

}
