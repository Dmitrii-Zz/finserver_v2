package ru.manager.finserver_v2.model.except;

public class NoAccessBillException extends RuntimeException {
    public NoAccessBillException(final String message) {
        super(message);
    }
}
