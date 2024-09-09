package ru.manager.finserver_v2.mapper;

import ru.manager.finserver_v2.dto.IncomeDto;
import ru.manager.finserver_v2.model.Income;

public class IncomeMapper {

    public static Income toIncome(IncomeDto incomeDto) {
        return Income.builder()
                .incomeId(incomeDto.getIncomeId())
                .count(incomeDto.getCount())
                .note(incomeDto.getNote())
                .date(incomeDto.getDate())
                .owner(UserMapper.toUser(incomeDto.getOwner()))
                .build();
    }

    public static IncomeDto toIncomeDto(Income income) {
        return IncomeDto.builder()
                .incomeId(income.getIncomeId())
                .count(income.getCount())
                .note(income.getNote())
                .date(income.getDate())
                .owner(UserMapper.toUserDto(income.getOwner()))
                .build();
    }
}