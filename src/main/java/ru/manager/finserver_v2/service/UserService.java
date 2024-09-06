package ru.manager.finserver_v2.service;

import ru.manager.finserver_v2.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto updateUser(long userId, UserDto userDto);
    UserDto getUser(long userId);
    void deleteUser(long userId);
}