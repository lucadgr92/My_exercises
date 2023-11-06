import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

OffsetDateTime fromString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
ZonedDateTime fromOffset = fromString.toZonedDateTime();

String formattedFull = fromOffset.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG));
String formattedMedium = fromOffset.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
String formattedShort = fromOffset.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

System.out.println(formattedFull);
System.out.println(formattedMedium);
System.out.println(formattedShort);

    }
}

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni