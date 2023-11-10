import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String date = "2023-03-01T13:00:00Z";
        System.out.println(fromIsoToLocalizedDate(addSevenDays(subtractOneMonth(addOneYear(fromStringToDate(date))))));
    }

    public static OffsetDateTime fromStringToDate (String str1) {
        return OffsetDateTime.parse(str1);
    }
    public static OffsetDateTime addOneYear (OffsetDateTime date1) {
        return date1.plusYears(1);
    }
    public static OffsetDateTime subtractOneMonth (OffsetDateTime date1) {
        return date1.minusMonths(1);
    }
    public static OffsetDateTime addSevenDays (OffsetDateTime date1) {
        return date1.plusDays(7);
    }

    public static String fromIsoToLocalizedDate (OffsetDateTime date1) {
        return date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }
}

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia