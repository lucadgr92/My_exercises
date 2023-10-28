public class Main {
    public static void main(String[] args) {
        divideBy(10);
    }

    public static int divideBy (int arg1) {
       int result = 0;
        try {
           result = arg1 / 0;
       } catch (ArithmeticException e) {
           System.out.println("Errore: " + e.getMessage());
       }
       return result;
    }
}

//Scrivere una funzione che provi a
// dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.

//Manca la gestione con try catch