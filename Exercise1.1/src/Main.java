public class Main {
    public static void main(String[] args) {
        System.out.println(rangeChecker(7));
    }

    public static boolean rangeChecker (int arg1) {
        if (arg1 < 2 || arg1 > 10) {
            throw new IllegalArgumentException("Il numero inserito non rientra nel range consentito.");
        }
        return 2 <= arg1 && arg1 <= 10;
        }
    }


//Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione