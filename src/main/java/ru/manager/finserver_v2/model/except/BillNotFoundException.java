package ru.manager.finserver_v2.model.except;

public class BillNotFoundException extends RuntimeException {
    public BillNotFoundException(final String message) {
        super(message);
    }
}
