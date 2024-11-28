package Lecture4_interfaces_abstract_classes;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.Stack;

public class WithdrawalTransaction extends BaseTransaction {
    private final Stack<Double> transactionStack = new Stack<>();
    public WithdrawalTransaction(int amount, @NotNull Calendar date) {
        super(amount, date);
    }

    private boolean checkDepositAmount(int amt) {
        if (amt < 0) {
            return false;
        } else {
            return true;
        }
    }

    // Method to reverse the transaction
    public void reverse(BankAccount ba) {
        if (transactionStack.empty()) {
            System.out.println("Transaction stack is empty");
        }
        ba.setBalance(ba.getBalance() + transactionStack.pop());
        System.out.println("Transaction stack reversed (balance): " + ba.getBalance());
    } // return true if reversal was successful

    // Method to print a transaction receipt or details
    public void printTransactionDetails() {
        System.out.println("Deposit Trasaction: " + this.toString());
    }

    /*
    Oportunity for assignment: implementing different form of withdrawal
     */
    public void apply(BankAccount ba) {
        System.out.println("Withdrawing amount:");
        double curr_balance = ba.getBalance();
        if (curr_balance > getAmount()) {
            double new_balance = curr_balance - getAmount();
            ba.setBalance(new_balance);
            this.transactionStack.push(getAmount());
            System.out.println("Amount withdrawal successfully paid (Balance): " + new_balance);
        }
    }

    /*
    Assignment 1 Q3: Write the Reverse method - a method unique to the WithdrawalTransaction Class
     */
}

