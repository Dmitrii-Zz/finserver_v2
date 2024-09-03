package ru.manager.finserver_v2.controller;

import jakarta.validation.constraints.Positive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.manager.finserver_v2.dto.UserDto;

@Slf4j
@Validated
@RestController
@RequestMapping("/finserver/users")
public class UserController {

    @PostMapping
    public UserDto createUser(@RequestBody @Validated UserDto userDto) {
        log.info("Запрос на создание пользователя с именем: '{}'", userDto.getName());
        return userDto;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable @Positive long userId) {
        log.info("Запрос на удаление пользователя id = '{}'", userId);
    }

    @PatchMapping("/{userId}")
    public UserDto updateUser(@PathVariable @Positive long userId,
                              @RequestBody @Validated UserDto userDto) {
        log.info("Запрос на обновление пользователя id = '{}'", userId);
        return userDto;
    }

}
