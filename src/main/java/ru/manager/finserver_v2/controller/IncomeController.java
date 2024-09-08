package ru.manager.finserver_v2.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.manager.finserver_v2.dto.IncomeDto;

import java.util.List;

import static ru.manager.finserver_v2.constant.Constants.USER_HEADER_ID;

@Slf4j
@Validated
@RestController
@RequestMapping("/finserver/income")
public class IncomeController {

    @PostMapping
    public IncomeDto addIncome(@RequestBody @Valid IncomeDto incomeDto,
                               @RequestHeader(USER_HEADER_ID) @Positive long userId) {
        log.info("Запрос от пользователя № '{}' на создание записи дохода.", userId);
        return null;
    }

    @GetMapping("/{incomeId}")
    public IncomeDto getIncome(@PathVariable @Positive long incomeId,
                               @RequestHeader(USER_HEADER_ID) @Positive long userId) {
        log.info("Запрос от пользователя '{}' траты № '{}'.", userId, incomeId);
        return null;
    }

    @GetMapping
    public List<String> getListIncome(@RequestHeader(USER_HEADER_ID) @Positive long userId) {
        log.info("Запрос от пользователя '{}' списка трат с фильтрами.", userId);
        // Фильтры могут быть: период, категории, подкатегории
        // больше, меньше или равно определенной сумме
        // Фильтр по ключевому слову по полю note
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