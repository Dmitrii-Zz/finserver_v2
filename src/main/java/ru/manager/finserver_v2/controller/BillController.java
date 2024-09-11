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
        log.info("Запрос от пользователя '{}' на создание счёта '{}'.", userId, billDto.getName());
        return billServiceImpl.createBill(billDto, userId);
    }

    @GetMapping
    public BillDto getBillById() {
        return null;
    }

    @GetMapping
    public List<BillDto> getAllBill() {
        return null;
    }

    @PatchMapping
    public BillDto updateBill() {
        return null;
    }

    @DeleteMapping
    public void deleteBill() {

    }
}
