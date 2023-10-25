public class Main {
    public static void main(String[] args) {
    stringProcessor("Ottogenario", 9);
    }
public static void stringProcessor(String string, int index) {
        StringBuilder hexaDecimal = new StringBuilder();
        if(index > string.length()) {
            System.out.println("Errore: indice non valido.");
        } else {
           char char1 = string.charAt(index);
           int decimalCode = Character.codePointAt(new char[] {char1}, 0);
           hexaDecimal.append(Integer.toHexString(decimalCode).toUpperCase());
           System.out.println("Il codice unicode di " + char1 + " è U+" + hexaDecimal);
        }
}
}

    //Scrivi un programma Java che abbia un metodo che prenda il
    //carattere in Unicode in un indice specifico all'interno di una
    //stringa e lo stampi.

    //Il metodo dovrà avere nel costruttore una stringa ed una posizione e
    //dovrà resituire il carattere in unicode o una stringa di errore.
    //Per la creazione della stringa di risultato dovrebbe essere utilizzato
    //StringBuilder.