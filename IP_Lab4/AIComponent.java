import java.util.ArrayList;
import java.util.List;

public class AIComponent {
    private BankEmployee employee;
    private List<String> knownQuestions;

    public AIComponent(BankEmployee employee) {
        this.employee = employee;
        this.knownQuestions = new ArrayList<>();
        initializeKnownQuestions();
    }

    private void initializeKnownQuestions() {
        knownQuestions.add("cont de credit");
        knownQuestions.add("cont de debit");
        knownQuestions.add("card");
        knownQuestions.add("împrumut pentru casnic");
        knownQuestions.add("împrumut pentru mașină");
        knownQuestions.add("împrumut pentru casă");
    }

    public String generateResponse(String question) {
        String response;
        String lowerQuestion = question.toLowerCase();

        if (lowerQuestion.contains("cont de credit")) {
            response = "Pentru a deschide un cont de credit, completați cererea online și furnizați dovada veniturilor.";
        } else if (lowerQuestion.contains("cont de debit")) {
            response = "Un cont de debit se deschide direct din aplicație cu un act de identitate valid.";
        } else if (lowerQuestion.contains("card")) {
            response = "Cardul asociat contului poate fi solicitat după deschiderea contului, livrat în 3-5 zile.";
        } else if (lowerQuestion.contains("împrumut")) {
            if (lowerQuestion.contains("casnic")) {
                response = "Împrumutul pentru un obiect casnic necesită un avans de 10% și rată fixă pe 3 ani.";
            } else if (lowerQuestion.contains("mașină")) {
                response = "Pentru împrumut auto, oferim finanțare până la 80% din valoarea mașinii.";
            } else if (lowerQuestion.contains("casă")) {
                response = "Împrumutul pentru casă necesită avans de 15% și evaluarea proprietății.";
            } else {
                response = "Vă rugăm să specificați tipul de împrumut dorit.";
            }
        } else {
            response = "Îmi pare rău, nu am înțeles întrebarea. Puteți reformula?";
        }

        System.out.println("IA generează răspunsul: " + response);
        return response;
    }

    public void sendToEmployee(String question, String response) {
        employee.reviewResponse(question, response);
    }

    public boolean isKnownQuestion(String question) {
        String lowerQuestion = question.toLowerCase();
        for (String known : knownQuestions) {
            if (lowerQuestion.contains(known)) {
                return true;
            }
        }
        return false;
    }
}