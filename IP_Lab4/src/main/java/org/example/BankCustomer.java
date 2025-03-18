package org.example;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankCustomer extends Person{
    private String customerID;

    public BankCustomer(String firstName, String lastName,int age, String eMail, String customerID) {
        super(firstName, lastName, age, eMail);
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "customerID='" + customerID + '\'' +
                '}';
    }
}
