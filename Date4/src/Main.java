import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime fromString = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime manipulatedDate = fromString.plusYears(1).minusMonths(1).plusDays(7);
        ZonedDateTime fromOffset = manipulatedDate.toZonedDateTime();

        String localizedResult = fromOffset.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));

        System.out.println(localizedResult);
    }
}

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia