public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(nullChecker(453, null));
        } catch (NullPointerException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        try {
            System.out.println(nullChecker(453, 45));
        } catch (NullPointerException e) {
            System.out.println("Errore: " + e.getMessage());
        }


    }

    public static int nullChecker (Integer numeratore, Integer denominatore) {
        int result = 0;
        if(numeratore != null && denominatore != null) {
            result = numeratore / denominatore;
        } else {
            throw new NullPointerException();
        }
        return result;
    }
}

//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura
//l'eventuale eccezione.