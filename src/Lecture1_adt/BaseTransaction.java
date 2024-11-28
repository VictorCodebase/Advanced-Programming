package Lecture1_adt;

import Lecture4_interfaces_abstract_classes.BankAccount;

import java.util.GregorianCalendar;

public class BaseTransaction implements TransactionInterface {


    public double getAmount() {
        System.out.println("BaseTransaction.getAmount()");
        return 0;
    }
    public GregorianCalendar getDate() {
        System.out.println("BaseTransaction.getDate()");
        return null;
    }
    public String getTransactionId() {
        System.out.println("BaseTransaction.getTransactionId()");
        return null;
    }

    //Common methods
    public void printTransactionDetails() {}
    public void apply(BankAccount account) {}
}
