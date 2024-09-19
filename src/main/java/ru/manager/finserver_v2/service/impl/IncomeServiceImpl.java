package ru.manager.finserver_v2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.manager.finserver_v2.dto.IncomeDto;
import ru.manager.finserver_v2.mapper.IncomeMapper;
import ru.manager.finserver_v2.repository.IncomeRepository;
import ru.manager.finserver_v2.service.interfaces.IncomeService;
import ru.manager.finserver_v2.service.interfaces.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IncomeServiceImpl implements IncomeService {

    private final IncomeRepository incomeStorage;
    private final UserService UserServiceImpl;

    @Override
    public IncomeDto addIncome(IncomeDto incomeDto, long userId, long billId) {
        incomeDto.setOwner(UserServiceImpl.getUser(userId));
        return IncomeMapper.toIncomeDto(incomeStorage.save(IncomeMapper.toIncome(incomeDto)));
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
