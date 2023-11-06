import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime fromString = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = fromString.getYear();
        int month = fromString.getMonthValue();
        int day = fromString.getDayOfMonth();
        DayOfWeek dayOfTheWeek = fromString.getDayOfWeek();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfTheWeek);

    }
}

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console