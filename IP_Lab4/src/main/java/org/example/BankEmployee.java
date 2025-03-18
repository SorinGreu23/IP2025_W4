package org.example;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankEmployee extends  Person {
    private String employeeID;

    public BankEmployee(String firstName, String lastName,int age, String eMail ,String ID){
        super(firstName,lastName,age,eMail);
        this.employeeID = ID;
    }

    @Override
    public String toString() {
        return "BankEmployee{" +
                "ID='" + employeeID + '\'' +
                '}';
    }
}
