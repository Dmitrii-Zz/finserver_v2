package ru.manager.finserver_v2.mapper;

import ru.manager.finserver_v2.dto.BillDto;
import ru.manager.finserver_v2.dto.BillUpdateDto;
import ru.manager.finserver_v2.model.Bill;

public class BillMapper {

    public static Bill toBill(BillDto billDto) {
        return Bill.builder()
                .billId(billDto.getBillId())
                .count(billDto.getCount())
                .name(billDto.getName())
                .owner(UserMapper.toUser(billDto.getOwner()))
                .build();
    }

    public static BillDto toBillDto(Bill bill) {
        return BillDto.builder()
                .billId(bill.getBillId())
                .count(bill.getCount())
                .name(bill.getName())
                .owner(UserMapper.toUserDto(bill.getOwner()))
                .build();
    }

    public static BillUpdateDto toBillUpdateBillDto(BillDto billDto) {
        return BillUpdateDto.builder()
                .billId(billDto.getBillId())
                .count(billDto.getCount())
                .name(billDto.getName())
                .owner(billDto.getOwner())
                .build();
    }
}
