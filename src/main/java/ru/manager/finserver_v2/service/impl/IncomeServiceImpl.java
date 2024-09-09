package ru.manager.finserver_v2.service.impl;

import ru.manager.finserver_v2.dto.IncomeDto;
import ru.manager.finserver_v2.service.interfaces.IncomeService;

import java.util.List;

public class IncomeServiceImpl implements IncomeService {
    
    @Override
    public IncomeDto addIncome(IncomeDto incomeDto, long userId) {
        return null;
    }

    @Override
    public IncomeDto getIncome(long incomeId, long userId) {
        return null;
    }

    @Override
    public List<IncomeDto> getListIncome(long userId) {
        return List.of();
    }

    @Override
    public IncomeDto updateIncome(IncomeDto incomeDto, long incomeId, long userId) {
        return null;
    }

    @Override
    public void deleteIncome(long incomeId, long userId) {

    }
}
