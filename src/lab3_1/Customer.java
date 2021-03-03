package lab3_1;

public class Customer {
    private String firstName, lastName;
    private BankAccount account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastNameName(){
        return lastName;
    }
    public BankAccount getAccount(){
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
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
