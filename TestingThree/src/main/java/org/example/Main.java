package org.example;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        String date = "2023-03-01T13:00:00Z";
        System.out.println(dateFormatter(fromStringToDate(date)));
    }

    public static OffsetDateTime fromStringToDate (String str1) {
        return OffsetDateTime.parse(str1);
    }

    public static String dateFormatter (OffsetDateTime date1) {
        return date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }
}

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console