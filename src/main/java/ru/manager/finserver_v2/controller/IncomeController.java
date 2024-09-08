package ru.manager.finserver_v2.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.manager.finserver_v2.dto.IncomeDto;

import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("/finserver/income")
public class IncomeController {

    @PostMapping
    public IncomeDto addIncome(@RequestBody @Valid IncomeDto incomeDto) {
        log.info("Запрос на создание записи дохода.");
        return null;
    }

    @GetMapping("/{incomeId}")
    public IncomeDto getIncome(@Positive long incomeId) {
        log.info("Запрос траты № '{}'.", incomeId);
        return null;
    }

    @GetMapping
    public List<String> getListIncome() {
        log.info("Запрос списка трат с фильтрами.");
        // Фильтры могут быть: период, категории, подкатегории
        // больше, меньше или равно определенной сумме
        // Фильтр по ключевому слову по полю note
        return null;
    }

    @PatchMapping("/{incomeId}")
    public IncomeDto updateIncome(@RequestBody @Valid IncomeDto incomeDto,
                                  @PathVariable @Positive long incomeId) {
        log.info("Запрос на обновление траты № '{}'", incomeId);
        return null;
    }

    @DeleteMapping("/{incomeId}")
    public String deleteIncome(@PathVariable @Positive long incomeId) {
        log.info("Запрос на удаление траты № '{}'", incomeId);
        return null;
    }
}