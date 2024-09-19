package ru.manager.finserver_v2.service.interfaces;

import ru.manager.finserver_v2.dto.IncomeDto;

import java.util.List;

public interface IncomeService {
    IncomeDto addIncome(IncomeDto incomeDto, long userId, long billId);
    IncomeDto getIncome(long incomeId, long  userId);
    List<IncomeDto> getListIncome(long userId);
    IncomeDto updateIncome(IncomeDto incomeDto, long incomeId, long userId);
    void deleteIncome(long incomeId, long userId);
}
