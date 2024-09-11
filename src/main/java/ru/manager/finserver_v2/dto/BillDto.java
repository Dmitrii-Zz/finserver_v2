package ru.manager.finserver_v2.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

@Data
@Builder
public class BillDto {

    private Long billId;

    @NotNull
    @Positive
    private BigDecimal count;

    @NotBlank
    @Length(max = 100)
    private String name;

    private UserDto owner;
}
