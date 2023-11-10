import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String date1 = "2023-03-01T13:00:00Z";
        String date2 = "2024-03-01T13:00:00Z";

        System.out.println("La prima data è precedente alla seconda: " + beforeCheck(dateMaker(date1,date2)));
        System.out.println("La seconda data è successiva alla prima: " + afterCheck(dateMaker(date1,date2)));
        System.out.println("La prima data è uguale ad ora: " + nowCheckOne(dateMaker(date1,date2)));
        System.out.println("La seconda data è uguale ad ora: " + nowCheckTwo(dateMaker(date1,date2)));


    }

    public static OffsetDateTime[] dateMaker (String str1, String str2) {
        OffsetDateTime[] dateBox = new OffsetDateTime[2];
        dateBox[0] = OffsetDateTime.parse(str1);
        dateBox[1] = OffsetDateTime.parse(str2);
        return dateBox;
    }
    public static boolean beforeCheck (OffsetDateTime[] dateBox1) {
        return dateBox1[0].isBefore(dateBox1[1]);
    }

    public static boolean afterCheck (OffsetDateTime[] dateBox1) {
        return dateBox1[1].isAfter(dateBox1[0]);
    }

    public static boolean nowCheckOne (OffsetDateTime[] dateBox1) {
        return dateBox1[0].isEqual(OffsetDateTime.now());
    }

    public static boolean nowCheckTwo (OffsetDateTime[] dateBox1) {
        return dateBox1[1].isEqual(OffsetDateTime.now());
    }

}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato