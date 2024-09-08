package ru.manager.finserver_v2.controller;

import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.manager.finserver_v2.dto.UserDto;
import ru.manager.finserver_v2.service.interfaces.UserService;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/finserver/users")
public class UserController {

    private final UserService aUserService;

    @PostMapping
    public UserDto createUser(@RequestBody @Validated UserDto userDto) {
        log.info("Запрос на создание пользователя с именем: '{}'", userDto.getName());
        return aUserService.createUser(userDto);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable @Positive long userId) {
        log.info("Запрос на удаление пользователя id = '{}'", userId);
        aUserService.deleteUser(userId);
    }

    @PatchMapping("/{userId}")
    public UserDto updateUser(@PathVariable @Positive long userId,
                              @RequestBody @Validated UserDto userDto) {
        log.info("Запрос на обновление пользователя id = '{}'", userId);
        return aUserService.updateUser(userId, userDto);
    }

    @GetMapping("/{userId}")
    public UserDto getUser(@PathVariable @Positive long userId) {
        log.info("Запрос пользователя id = '{}'", userId);
        return aUserService.getUser(userId);
    }
}