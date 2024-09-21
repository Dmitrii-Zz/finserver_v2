package ru.manager.finserver_v2.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.manager.finserver_v2.dto.IncomeDto;
import ru.manager.finserver_v2.service.interfaces.IncomeService;

import java.util.List;

import static ru.manager.finserver_v2.constant.Constants.USER_HEADER_ID;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/finserver/income")
public class IncomeController {

    private final IncomeService incomeServiceImpl;

    @PostMapping
    public IncomeDto addIncome(@RequestBody @Valid IncomeDto incomeDto,
                               @RequestHeader(USER_HEADER_ID) @Positive long userId,
                               @RequestParam @Positive long billId) {
        log.info("Запрос от пользователя № '{}' на создание записи дохода на счёт № '{}'.", userId, billId);
        return incomeServiceImpl.addIncome(incomeDto, userId, billId);
    }

    @GetMapping("/{incomeId}")
    public IncomeDto getIncome(@PathVariable @Positive long incomeId,
                               @RequestHeader(USER_HEADER_ID) @Positive long userId) {
        log.info("Запрос от пользователя '{}' траты № '{}'.", userId, incomeId);
        return incomeServiceImpl.getIncome(incomeId, userId);
    }

    @GetMapping
    public List<String> getListIncome(@RequestHeader(USER_HEADER_ID) @Positive long userId) {
        log.info("Запрос от пользователя '{}' списка трат с фильтрами.", userId);
        return null;
    }

    @PatchMapping("/{incomeId}")
    public IncomeDto updateIncome(@RequestBody @Valid IncomeDto incomeDto,
                                  @PathVariable @Positive long incomeId,
                                  @RequestHeader(USER_HEADER_ID) @Positive long userId) {
        log.info("Запрос от пользователя '{}' на обновление траты № '{}'", userId, incomeId);
        return null;
    }

    @DeleteMapping("/{incomeId}")
    public String deleteIncome(@PathVariable @Positive long incomeId,
                               @RequestHeader(USER_HEADER_ID) @Positive long userId) {
        log.info("Запрос от пользователя '{}' на удаление траты № '{}'", userId, incomeId);
        return null;
    }
}