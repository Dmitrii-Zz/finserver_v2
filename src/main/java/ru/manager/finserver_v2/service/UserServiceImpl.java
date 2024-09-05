package ru.manager.finserver_v2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.manager.finserver_v2.dto.UserDto;
import ru.manager.finserver_v2.mapper.UserMapper;
import ru.manager.finserver_v2.repository.UserRepository;

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
        return null;
    }

    @Override
    public void deleteUser(long userId) {

    }
}
