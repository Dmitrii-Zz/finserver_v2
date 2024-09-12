package ru.manager.finserver_v2.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.manager.finserver_v2.dto.BillDto;
import ru.manager.finserver_v2.service.interfaces.BillService;

import java.util.List;

import static ru.manager.finserver_v2.constant.Constants.USER_HEADER_ID;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/finserver/bill")
public class BillController {

    private final BillService billServiceImpl;

    @PostMapping
    public BillDto createBill(@RequestBody @Valid BillDto billDto,
                              @RequestHeader(USER_HEADER_ID) @Positive long userId) {
        log.info("Запрос от пользователя № '{}' на создание счёта № '{}'.", userId, billDto.getName());
        return billServiceImpl.createBill(billDto, userId);
    }

    @GetMapping("/{billId}")
    public BillDto getBillById(@RequestHeader(USER_HEADER_ID) @Positive long userId,
                               @PathVariable @Positive long billId) {
        log.info("Запрос от пользователя № '{}' информации о счете № '{}'", userId, billId);
        return billServiceImpl.getBillById(billId, userId);
    }

    @GetMapping
    public List<BillDto> getAllBill(@RequestHeader(USER_HEADER_ID) @Positive long userId) {
        log.info("Запрос от пользователя № '{}' всех счетов.", userId);
        return billServiceImpl.getAllBill(userId);
    }

    @PatchMapping
    public BillDto updateBill() {
        return null;
    }

    @DeleteMapping
    public void deleteBill() {

    }
}
