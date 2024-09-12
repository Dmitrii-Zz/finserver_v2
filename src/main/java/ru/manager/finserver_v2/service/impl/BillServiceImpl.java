package ru.manager.finserver_v2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.manager.finserver_v2.dto.BillDto;
import ru.manager.finserver_v2.repository.BillRepository;
import ru.manager.finserver_v2.service.interfaces.BillService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService {

    private final BillRepository billStorage;
    
    @Override
    public BillDto createBill(BillDto billDto, long userId) {
        return null;
    }

    @Override
    public BillDto getBillById(long billId, long userId) {
        return null;
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

    }
}
