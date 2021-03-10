package lab3_1;

import lab3_1.Customer;

public class Main {

    public static void main(String[] args) {
        /*
        Customer customer1 = new Customer("Kis", "Pista");
        customer1.setAccount(new BankAccount("OTP0001"));
        System.out.println(customer1.getAccount());
        System.out.println(customer1);

        Customer customer2 = new Customer("Nagy", "Maria");
        customer2.setAccount(new BankAccount("OTP0002"));
        System.out.println(customer2.getAccount());
        System.out.println(customer2);

         */
        Customer customer3 = new Customer ("Kis", "Margit");
        customer3.setAccount(new BankAccount("OTP0003"));
        System.out.println(customer3.toString());
        Customer customer4 = new Customer ("Nagy", "Alma");
        customer4.setAccount(customer3.getAccount());

        customer3.getAccount().deposit(500);
        System.out.println(customer3.toString());
        System.out.println(customer4.toString());

    }
}
