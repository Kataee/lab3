package lab3_1;

import lab3_1.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Kis", "Pista");
        customer1.setAccount(new BankAccount("OTP0001"));
        System.out.println(customer1.getAccount());
        System.out.println(customer1);

        Customer customer2 = new Customer("Nagy", "Maria");
        customer2.setAccount(new BankAccount("OTP0002"));
        System.out.println(customer2.getAccount());
        System.out.println(customer2);
    }
}