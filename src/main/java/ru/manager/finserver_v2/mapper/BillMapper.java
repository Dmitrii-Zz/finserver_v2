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

    public static Bill toBill(BillUpdateDto billUpdateDto) {
        return Bill.builder()
                .billId(billUpdateDto.getBillId())
                .count(billUpdateDto.getCount())
                .name(billUpdateDto.getName())
                .owner(UserMapper.toUser(billUpdateDto.getOwner()))
                .build();
    }
}
