package org.example;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankEmployee extends  Person {
    private String employeeID;
    private BankCustomer customer;

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

    public void reviewResponse(String question, String response) {
        String finalAnswer;

        if (response.contains("Îmi pare rău") || response.contains("nu am înțeles") || response.contains("reformula")) {
            finalAnswer = "Vă rugăm să contactați un angajat al băncii pentru clarificări suplimentare.";
            System.out.println("Angajatul " + getFirstName() + " detectează o problemă și corectează: " + finalAnswer);
        } else if (!isResponseRelevant(question, response)) {
            finalAnswer = "Ne pare rău, răspunsul generat nu este adecvat. Vă rugăm să ne contactați direct.";
            System.out.println("Angajatul " + getFirstName() + " corectează un răspuns irelevant: " + finalAnswer);
        } else {
            finalAnswer = response;
            System.out.println("Angajatul " + getFirstName() + " aprobă răspunsul: " + finalAnswer);
        }

        if (customer != null) {
            customer.receiveAnswer(finalAnswer);
        } else {
            System.out.println("Eroare: Clientul nu este setat pentru acest angajat.");
        }
    }

    private boolean isResponseRelevant(String question, String response) {
        String lowerQuestion = question.toLowerCase();
        String lowerResponse = response.toLowerCase();

        if (lowerQuestion.contains("cont de credit") && lowerResponse.contains("cerere online")) {
            return true;
        } else if (lowerQuestion.contains("cont de debit") && lowerResponse.contains("act de identitate")) {
            return true;
        } else if (lowerQuestion.contains("card") && lowerResponse.contains("livrat")) {
            return true;
        } else if (lowerQuestion.contains("împrumut") && lowerResponse.contains("avans")) {
            return true;
        }
        return false;
    }
}
