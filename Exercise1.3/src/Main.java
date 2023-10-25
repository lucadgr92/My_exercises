public class Main {
    public static void main(String[] args) {
        divideBy(10);
    }

    public static void divideBy (int arg1) {
        try {
            int result = arg1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

//Scrivere una funzione che provi a
// dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.