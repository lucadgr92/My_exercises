public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(rangeChecker(8));
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static boolean rangeChecker (int arg1) {
            if (arg1 < 2 || arg1 > 10) {
                throw new IllegalArgumentException();
            } else {
                return true;
            }
    }
}


//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione

//Ti manca il try catch per la gestione degli errori che lanci nel metodo

