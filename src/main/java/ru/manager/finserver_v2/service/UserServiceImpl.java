package ru.manager.finserver_v2.service;

import org.springframework.stereotype.Service;
import ru.manager.finserver_v2.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
    
    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
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
