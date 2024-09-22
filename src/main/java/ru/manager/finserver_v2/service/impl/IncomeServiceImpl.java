package ru.manager.finserver_v2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.manager.finserver_v2.dto.BillDto;
import ru.manager.finserver_v2.dto.IncomeDto;
import ru.manager.finserver_v2.dto.UserDto;
import ru.manager.finserver_v2.mapper.BillMapper;
import ru.manager.finserver_v2.mapper.IncomeMapper;
import ru.manager.finserver_v2.model.Income;
import ru.manager.finserver_v2.model.except.IncomeNotFoundException;
import ru.manager.finserver_v2.repository.IncomeRepository;
import ru.manager.finserver_v2.service.interfaces.BillService;
import ru.manager.finserver_v2.service.interfaces.IncomeService;
import ru.manager.finserver_v2.service.interfaces.UserService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IncomeServiceImpl implements IncomeService {

    private final IncomeRepository incomeStorage;
    private final UserService userServiceImpl;
    private final BillService billServiceImpl;

    @Override
    public IncomeDto addIncome(IncomeDto incomeDto, long userId, long billId) {
        BillDto billDto = billServiceImpl.getBillById(billId, userId);
        incomeDto.setBillDto(billDto);
        UserDto userDto = userServiceImpl.getUser(userId);
        incomeDto.setOwner(userDto);

        billDto.setCount(billDto.getCount().add(incomeDto.getCount()));
        billServiceImpl.updateBill(BillMapper.toBillUpdateBillDto(billDto), userId, billId);

        return IncomeMapper.toIncomeDto(incomeStorage.save(IncomeMapper.toIncome(incomeDto)));
    }

    @Override
    public IncomeDto getIncome(long incomeId, long userId) {
        Optional<Income> incomeOptional = incomeStorage.findByIncomeIdAndOwnerUserId(incomeId, userId);

        if (incomeOptional.isEmpty()) {
            throw new IncomeNotFoundException("Отсутствует запись дохода № '" + incomeId + "' или доступ к ней!");
        }

        return IncomeMapper.toIncomeDto(incomeOptional.get());
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
