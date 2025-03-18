package org.example;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankCustomer extends Person{
    private String customerID;
    private AI ai;

    public BankCustomer(String firstName, String lastName,int age, String eMail, String customerID, AI ai) {
        super(firstName, lastName, age, eMail);
        this.customerID = customerID;
        this.ai = ai;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "customerID='" + customerID + '\'' +
                '}';
    }

    public void askQuesstion(String question){
        System.out.print("Client " + getFirstName() + " " + getLastName() + "\nIntrebare: " + question);

        String response = ai.generateResponse(question);

        if(!ai.isKnownQuestion(question)){
            System.out.println("Întrebarea este necunoscută. Trimitem către un angajat.");
            ai.sendToEmployee(question,response);
        } else {
            System.out.println("Raspuns AI: " + response);
        }
    }

    public void receiveAnswer(String response) {
        System.out.println("Clientul primește răspunsul: " + response);
    }
}
