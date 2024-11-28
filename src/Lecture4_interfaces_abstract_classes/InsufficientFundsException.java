package Lecture4_interfaces_abstract_classes;

/**
 * Exception to handle insufficient funds errors
 */
public class InsufficientFundsException extends Exception {

    /**
     * overloaded constructor
     * Creates an instance of {@code InsufficientFundsException} with message
     */
    public InsufficientFundsException(String message) {super(message);}
}
