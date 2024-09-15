package ru.manager.finserver_v2.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

@Data
@Builder
public class BillUpdateDto {

    private Long billId;

    @Positive
    private BigDecimal count;

    @Length(max = 100)
    private String name;

    private UserDto owner;

}
