import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        try {
            String date = "2023-03-01T13:00:00Z";

            System.out.println(fromOffsetToYear(fromStringToDate(date)));
            System.out.println(fromOffsetToDayOfMonth(fromStringToDate(date)));
            System.out.println(fromOffsetToDayOfWeek(fromStringToDate(date)));
            System.out.println(fromOffsetToMonthValue(fromStringToDate(date)));

        } catch (NullPointerException e) {
            System.out.println("Errore.");
        }
    }

    public static OffsetDateTime fromStringToDate (String str1) {
        return OffsetDateTime.parse(str1);
    }


    public static int fromOffsetToYear (OffsetDateTime dateAndTime) {
        return dateAndTime.getYear();
    }

    public static int fromOffsetToMonthValue (OffsetDateTime dateAndTime) {
        return dateAndTime.getMonthValue();
    }

    public static int fromOffsetToDayOfMonth (OffsetDateTime dateAndTime) {
        return dateAndTime.getDayOfMonth();
    }

    public static String fromOffsetToDayOfWeek (OffsetDateTime dateAndTime) {
        return dateAndTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);
    }


}


//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console