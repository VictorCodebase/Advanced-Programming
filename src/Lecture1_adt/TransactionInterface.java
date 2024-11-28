package Lecture1_adt;

import java.util.GregorianCalendar;

public interface TransactionInterface {
    double getAmount();
    GregorianCalendar getDate();
    String getTransactionId();
}
