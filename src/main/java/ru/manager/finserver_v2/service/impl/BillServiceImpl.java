package ru.manager.finserver_v2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.manager.finserver_v2.dto.BillDto;
import ru.manager.finserver_v2.dto.UserDto;
import ru.manager.finserver_v2.mapper.BillMapper;
import ru.manager.finserver_v2.model.Bill;
import ru.manager.finserver_v2.repository.BillRepository;
import ru.manager.finserver_v2.service.interfaces.BillService;
import ru.manager.finserver_v2.service.interfaces.UserService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService {

    private final BillRepository billStorage;
    private final UserService userServiceImpl;
    
    @Override
    public BillDto createBill(BillDto billDto, long userId) {
        billDto.setOwner(userServiceImpl.getUser(userId));
        return BillMapper.toBillDto(billStorage.save(BillMapper.toBill(billDto)));
    }

    @Override
    public BillDto getBillById(long billId, long userId) {
        UserDto userDto = userServiceImpl.getUser(userId);
        Optional<Bill> billOptional = billStorage.findById(billId);

        if (billOptional.isEmpty()) {
            throw new RuntimeException("Счёт № '" + billId + "' отсутствует.");
        }

        if (userDto.getId() != billOptional.get().getOwner().getUserId()) {
            throw new RuntimeException("Отсутствует доступ к счету № " + billId);
        }

        return BillMapper.toBillDto(billOptional.get());
    }

    @Override
    public List<BillDto> getAllBill(long userId) {

        return List.of();
    }

    @Override
    public BillDto updateBill(BillDto billDto, long userId, long billId) {
        return null;
    }

    @Override
    public void deleteBill(long billId, long userId) {
        UserDto userDto = userServiceImpl.getUser(userId);
        Optional<Bill> billOptional = billStorage.findById(billId);

        if (billOptional.isEmpty()) {
            throw new RuntimeException("Счёт № '" + billId + "' отсутствует.");
        }

        if (userDto.getId() != billOptional.get().getOwner().getUserId()) {
            throw new RuntimeException("Отсутствует доступ к счету № " + billId);
        }

        billStorage.delete(billOptional.get());
    }
}
