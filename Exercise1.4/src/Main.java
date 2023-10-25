public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        arrayExceptions(myArray,4);
    }
    public static void arrayExceptions (int[] array1, int index) {
        try {
            int result = array1[index] / 0;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Forza Palermo.");
        }
    }
}

// Scrivere una funzione che accetti un array in input e provi a dividere un numero
// dell'array per 0 e gestista sia l'eccezione della divisione che quella di indice
// non presente nell'array, leggendone il messaggio.
// Eseguire sempre un blocco di codice
// scrivendo un messaggio in console.