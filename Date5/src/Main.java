import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime firstDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime secondDate = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean firstCheck = firstDate.isBefore(secondDate);
        boolean secondCheck = secondDate.isAfter(firstDate);
        boolean thirdCheck = firstDate.equals(OffsetDateTime.now());
        boolean fourthCheck = secondDate.equals(OffsetDateTime.now());

        System.out.println("La prima data è precedente alla seconda: " + firstCheck);
        System.out.println("La seconda data è successiva alla prima: " + secondCheck);
        System.out.println("La prima data è uguale ad ora: " + thirdCheck);
        System.out.println("La seconda data è uguale ad ora: " + fourthCheck);


    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato