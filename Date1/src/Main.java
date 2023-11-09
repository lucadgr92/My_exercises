import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        String date = "2002-03-01T13:00:00Z";


System.out.println(toStringLong(fromStringToDate(date)));
System.out.println(toStringMedium(fromStringToDate(date)));
System.out.println(toStringShort(fromStringToDate(date)));

    }

    public static ZonedDateTime fromStringToDate (String str1) {
        OffsetDateTime fromString = OffsetDateTime.parse(str1);
        return fromString.toZonedDateTime();
    }

    public static String toStringLong (ZonedDateTime date1) {
        return date1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG));
    }

    public static String toStringMedium (ZonedDateTime date1) {
        return date1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }

    public static String toStringShort (ZonedDateTime date1) {
        return date1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
    }

}

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni