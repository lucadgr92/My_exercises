package org.example;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        String date1 = "2023-03-01T13:00:00Z";
        String date2 = "2024-03-01T13:00:00Z";

        System.out.println("La prima data è precedente alla seconda: " + beforeCheck(firstDateMaker(date1), secondDateMaker(date2)));
        System.out.println("La seconda data è successiva alla prima: " + afterCheck(firstDateMaker(date1), secondDateMaker(date2)));
        System.out.println("La prima data è uguale ad ora: " + nowCheckOne(firstDateMaker(date1)));
        System.out.println("La seconda data è uguale ad ora: " + nowCheckTwo(firstDateMaker(date2)));


    }

    public static OffsetDateTime firstDateMaker (String str1) {
        return OffsetDateTime.parse(str1);
    }
    public static OffsetDateTime secondDateMaker (String str1) {
        return OffsetDateTime.parse(str1);
    }

    public static boolean beforeCheck (OffsetDateTime date1, OffsetDateTime date2) {
        return date1.isBefore(date2);
    }

    public static boolean afterCheck (OffsetDateTime date1, OffsetDateTime date2) {
        return date2.isAfter(date1);
    }

    public static boolean nowCheckOne (OffsetDateTime date1) {
        return date1.isEqual(OffsetDateTime.now());
    }

    public static boolean nowCheckTwo (OffsetDateTime date1) {
        return date1.isEqual(OffsetDateTime.now());
    }

}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato
