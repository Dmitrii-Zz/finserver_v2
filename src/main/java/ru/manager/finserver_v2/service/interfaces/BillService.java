package ru.manager.finserver_v2.service.interfaces;

import ru.manager.finserver_v2.dto.BillDto;
import ru.manager.finserver_v2.dto.BillUpdateDto;

import java.util.List;

public interface BillService {
    BillDto createBill(BillDto billDto, long userId);
    BillDto getBillById(long billId, long userId);
    List<BillDto> getAllBill(long userId);
    BillDto updateBill(BillUpdateDto billDto, long userId, long billId);
    void deleteBill(long billId, long userId);
}
