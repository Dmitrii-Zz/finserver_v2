package ru.manager.finserver_v2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finserver/income")
public class IncomeController {

    @GetMapping
    public String addIncome() {
        return "Возвращаем что-нибудь";
    }
}
