package ru.manager.finserver_v2.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDto {

    private long id;

    @NotBlank(message = "Имя не может быть пустым")
    @Length(max = 50)
    private String name;
}
