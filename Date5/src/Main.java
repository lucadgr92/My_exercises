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
    //Originariamente i metodi erano due per ovviare al fatto che un singolo metodo
    //possa restituire un singolo oggetto e quindi non più di una data. Ho riunito tutto
    //in un unico metodo per far sì che entrambe le date possano essere parsate e restituite
    //dalla medesima funzione.
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

    //Credevo che la consegna volesse spingere ad usare sia il metodo isBefore che il metodo isAfter.
    //Per questo ho separato le due operazioni in due metodi, anche se ovviamente l'informazione restituita
    //dal secondo metodo (i.e., afterCheck) è implicita in quanto restituitoci dal primo metodo (i.e., beforeCheck).

    public static boolean nowCheckOne (OffsetDateTime[] dateBox1) {
        return dateBox1[0].isEqual(OffsetDateTime.now());
    }

    public static boolean nowCheckTwo (OffsetDateTime[] dateBox1) {
        return dateBox1[1].isEqual(OffsetDateTime.now());
    }

    //Ho interpretato la consegna pensando che entrambe le date parsate dovessero essere separatamente confrontate
    //con ora e data attuali ed ho affidato il compito a due metodi separati.

}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato