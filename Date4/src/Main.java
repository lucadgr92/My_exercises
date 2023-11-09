import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String date = "2023-03-01T13:00:00Z";
        System.out.println(fromIsoToLocalizedDate(date));
    }

    public static String fromIsoToLocalizedDate (String str1) {
        OffsetDateTime fromStringToOffset = OffsetDateTime.parse(str1).plusYears(1).minusMonths(1).plusDays(7);
        ZonedDateTime fromOffsetToZoned = fromStringToOffset.toZonedDateTime();
        return fromOffsetToZoned.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }
}

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia