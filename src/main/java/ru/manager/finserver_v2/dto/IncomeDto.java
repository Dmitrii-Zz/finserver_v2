package ru.manager.finserver_v2.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class IncomeDto {

    private Long incomeId;

    @NotNull
    @Positive
    private BigDecimal count;

    @NotBlank
    @Length(max = 100)
    private String note;

    @NotNull
    private LocalDate date;

    private UserDto owner;
    
    private BillDto billDto;
}