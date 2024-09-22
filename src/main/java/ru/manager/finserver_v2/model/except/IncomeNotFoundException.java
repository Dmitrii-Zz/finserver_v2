package ru.manager.finserver_v2.model.except;

public class IncomeNotFoundException extends RuntimeException {
    public IncomeNotFoundException(final String message) {
        super(message);
    }
}
