public class Main {
    public static void main(String[] args) throws NotANumberException {
    System.out.println(numberChecker('r'));

    }

public static boolean numberChecker (char arg1) throws NotANumberException {
        int unicodeDecimal = (int)arg1;

        if(unicodeDecimal < 48 || unicodeDecimal > 57) {
            throw new NotANumberException("Il carattere inserito non è un numero.");
        }
        return 48 <= unicodeDecimal && unicodeDecimal <= 57;
}

}

//Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare
// una eccezione.