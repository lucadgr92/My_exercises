public class Main {
    public static void main(String[] args) {
        System.out.println(rangeChecker(8));
    }

    public static boolean rangeChecker (int arg1) {
        try {

            if (arg1 < 2 || arg1 > 10) {
                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Il numero inserito come argomento non rientra nel range consentito.");
            return false;
        }
        return true;
        }
    }


//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione

//Ti manca il try catch per la gestione degli errori che lanci nel metodo

