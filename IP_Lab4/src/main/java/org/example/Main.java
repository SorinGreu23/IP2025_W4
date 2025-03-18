package org.example;

public class Main {
    public static void main(String[] args) {

        BankEmployee employee = new BankEmployee("Nicu", "Acasandrei", 21, "AleAca@gmail.com", "EMP123");

        AI ai = new AI(employee);

        BankCustomer customer = new BankCustomer("Sorin", "Greu", 21, "SorinGreu2003@gmail.com", "CUST456", ai);

        employee.setCustomer(customer);

        customer.askQuesstion("Cum pot obține un împrumut pentru casă?");
    }
}