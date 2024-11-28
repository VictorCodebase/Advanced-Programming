import Lecture4_interfaces_abstract_classes.BankAccount;
import Lecture4_interfaces_abstract_classes.DepositTrasaction;
import Lecture4_interfaces_abstract_classes.WithdrawalTransaction;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(0);
        makeDeposit(ba, 1500);
        WithdrawalTransaction withdrawal = makeWithdrawal(ba, 1200);
        reverseWithdrawal(ba, withdrawal);

        WithdrawalTransaction overDraft = makeWithdrawal(ba, 15_500_000);
        attemptOverDraft(ba, overDraft);
    }

    public static void makeDeposit(BankAccount ba, int amount) {
        DepositTrasaction deposit = new DepositTrasaction(amount, new GregorianCalendar(2023, Calendar.JANUARY,3));
        deposit.apply(ba);
    }
    public static WithdrawalTransaction makeWithdrawal(BankAccount ba, int amount) {
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(amount, new GregorianCalendar(2023, Calendar.JANUARY,3));
        try {
            withdrawal.apply(ba);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return withdrawal;
    }
    public static void reverseWithdrawal(BankAccount ba, WithdrawalTransaction withdrawal) {
        withdrawal.reverse(ba);
    }
    public static void attemptOverDraft(BankAccount ba, WithdrawalTransaction withdrawal) {
        try{
            withdrawal.apply(ba);
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}