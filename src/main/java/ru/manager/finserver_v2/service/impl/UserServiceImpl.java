package ru.manager.finserver_v2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.manager.finserver_v2.dto.UserDto;
import ru.manager.finserver_v2.mapper.UserMapper;
import ru.manager.finserver_v2.model.User;
import ru.manager.finserver_v2.model.except.UserNotFoundException;
import ru.manager.finserver_v2.repository.UserRepository;
import ru.manager.finserver_v2.service.interfaces.UserService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userStorage;
    
    @Override
    public UserDto createUser(UserDto userDto) {
        return UserMapper.toUserDto(userStorage.save(UserMapper.toUser(userDto)));
    }

    @Override
    public UserDto updateUser(long userId, UserDto userDto) {
        return null;
    }

    @Override
    public UserDto getUser(long userId) {
        Optional<User> userOptional = userStorage.findById(userId);

        if (userOptional.isEmpty()) {
            throw new UserNotFoundException("Пользователя с '" + userId + "' не существует!");
        }

        return UserMapper.toUserDto(userOptional.get());
    }

    @Override
    public void deleteUser(long userId) {

    }
}
