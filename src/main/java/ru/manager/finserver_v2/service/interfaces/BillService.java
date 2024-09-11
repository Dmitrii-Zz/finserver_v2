package ru.manager.finserver_v2.service.interfaces;

import ru.manager.finserver_v2.dto.BillDto;

import java.util.List;

public interface BillService {
    BillDto createBill(BillDto billDto, long userId);
    BillDto getBillById(long billId, long userId);
    List<BillDto> getAllBill(long userId);
    BillDto updateBill(BillDto billDto, long userId);
    void deleteBill(long billId, long userId);
}
