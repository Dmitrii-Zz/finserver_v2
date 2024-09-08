package ru.manager.finserver_v2.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/finserver/income")
public class IncomeController {

    @PostMapping
    public String addIncome() {
        return null;
    }

    @GetMapping
    public String getIncome() {
        return "Возвращаем одну трату";
    }

    @GetMapping
    public List<String> getListIncome() {
        return null;
    }

    @PatchMapping
    public String updateIncome() {
        return null;
    }

    @DeleteMapping
    public String deleteIncome() {
        return null;
    }
}