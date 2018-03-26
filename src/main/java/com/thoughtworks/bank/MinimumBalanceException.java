package main.java.com.thoughtworks.bank;

public class MinimumBalanceException extends Exception {
    MinimumBalanceException(){
        super("Balance is less than threshold balance");
    }
}
