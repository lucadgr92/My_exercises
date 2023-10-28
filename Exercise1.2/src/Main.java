public class Main {
    public static void main(String[] args) throws NotANumberException {
    System.out.println(numberChecker('r'));
    System.out.println(numberChecker2('r', 48, 57));

    //Ho adottato tutti i suggerimenti avanzati nel secondo metodo, mentre nel primo
    //ho solamente aggiunto il blocco try-catch. Però perché la necessità di passare
    //gli interi necessari alla verifica come argomenti? La loro funzione era solamente
    //verificare se il valore unicode del carattere rientrasse entro il range tra 48
    //e 57 che identifica i numeri da 0 a 9. Il valore decimale che identifica i numeri
    //è sempre lo stesso ai fini della verifica. Quindi perché permetterne la modifica?

    }

public static boolean numberChecker (char arg1) throws NotANumberException {
        int unicodeDecimal = (int)arg1;

        try {
            if (unicodeDecimal < 48 || unicodeDecimal > 57) {
                throw new NotANumberException();
            }
        } catch (NotANumberException e) {
            System.out.println("Il carattere inserito non è un numero.");
            return false;
        }
        return true;
}

    public static boolean numberChecker2 (char arg1, int arg2, int arg3) throws NotANumberException {
        int unicodeDecimal = (int)arg1;

        try {
            if (unicodeDecimal < arg2 || unicodeDecimal > arg3) {
                throw new NotANumberException();
            }
        } catch (NotANumberException e) {
            System.out.println("Il carattere inserito non è un numero.");
            return false;
        }
        return true;
    }

}

//Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare
// una eccezione.

//Avresti potuto semplificare il metodo di verifica dei valori, avresti
// potuto utilizzare un range passato nel metodo e ti manca la gestione
// con try catch della exception