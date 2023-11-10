import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
            operationSelector(Operazioni.SOTTRAZIONE, BigDecimal.valueOf(10.7), BigDecimal.valueOf(6.5));
    }

     enum Operazioni {ADDIZIONE, SOTTRAZIONE, MOLTIPLICAZIONI, DIVISIONE, MIN, MAX};

    public static void operationSelector (Operazioni operazione, BigDecimal arg1, BigDecimal arg2) {

        System.out.println("L'operazione selezionata è: " + operazione);
        System.out.println("Il primo valore inserito è: " + arg1);
        System.out.println("Il secondo valore inserito è: " + arg2);

        switch(operazione) {
            case ADDIZIONE: System.out.println("Risultato dell'operazione: " + addizione(arg1, arg2));
            break;
            case SOTTRAZIONE: System.out.println("Risultato dell'operazione: " + sottrazione(arg1, arg2));
            break;
            case MOLTIPLICAZIONI: System.out.println("Risultato dell'operazione: " + moltiplicazioni(arg1, arg2));;
            break;
            case DIVISIONE: System.out.println("Risultato dell'operazione: " + divisione(arg1, arg2));;
            break;
            case MIN: System.out.println("Il valore più basso è: " + min(arg1, arg2));;
            break;
            case MAX: System.out.println("Il valore più alto è: " + max(arg1, arg2));
        }

    }


    public static BigDecimal addizione (BigDecimal arg1, BigDecimal arg2) {
        return arg1.add(arg2);
    }

    public static BigDecimal sottrazione (BigDecimal arg1, BigDecimal arg2) {
        return arg1.subtract(arg2);
    }

    public static BigDecimal moltiplicazioni (BigDecimal arg1, BigDecimal arg2) {
        return arg1.add(arg2);
    }

    public static BigDecimal divisione (BigDecimal arg1, BigDecimal arg2) {
        return arg1.divide(arg2,4, RoundingMode.DOWN);
    }

    public static BigDecimal min (BigDecimal arg1, BigDecimal arg2) {
        return arg1.min(arg2);
    }

    public static BigDecimal max (BigDecimal arg1, BigDecimal arg2) {
        return arg1.max(arg2);
    }

}

//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
// (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un
// enum, crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati
// a schermo