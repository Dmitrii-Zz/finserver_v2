package ru.manager.finserver_v2.mapper;

import ru.manager.finserver_v2.dto.UserDto;
import ru.manager.finserver_v2.model.User;

public class UserMapper {

    public static User toUser(UserDto userDto) {
        return User.builder()
                .userId(userDto.getId())
                .name(userDto.getName())
                .build();
    }

    public static UserDto toUserDto(User user) {
        return UserDto.builder()
                .id(user.getUserId())
                .name(user.getName())
                .build();
    }
}
