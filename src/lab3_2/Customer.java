package lab3_2;

import lab3_1.BankAccount;

public class Customer {
    private String firstName, lastName;
    private BankAccount account;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount accounts[] = new BankAccount [MAX_ACCOUNTS];

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount(){
        return account;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastNameName(){
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(BankAccount account) {
        account = null;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n\t" + account.toString();
        // return "Name: " + firstName + lastName + "\n\t" + getAccount().getAccountNumber() + getAccount().getBalance();
    }
}
