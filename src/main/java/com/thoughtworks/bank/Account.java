package main.java.com.thoughtworks.bank;


public class Account {
    private final String account_number;
    private int balance;
    private String name;
    public static final int MinimumBalance;

    static {
        MinimumBalance = 1000;
    }
    public Account(String number,String name,int balance) throws MinimumBalanceException{
        this.account_number = number;
        if(balance < MinimumBalance){
            throw new MinimumBalanceException();
        }
        this.balance = balance;
        this.name = name;
    }

    public int getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return account_number;
    }
}
