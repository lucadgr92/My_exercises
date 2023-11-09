import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        String date = "2023-03-01T13:00:00Z";

        System.out.println(fromStringToDate(date).getYear());
        System.out.println(fromStringToDate(date).getMonthValue());
        System.out.println(fromStringToDate(date).getDayOfMonth());
        System.out.println(fromStringToDate(date).getDayOfWeek());

    }

    public static OffsetDateTime fromStringToDate (String str1) {
        return OffsetDateTime.parse(str1);
    }
}

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console