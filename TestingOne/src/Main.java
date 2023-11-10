public class Main {
    public static void main(String[] args) {

        int int1 = 5;
        Integer boxedInt = int1;
        double double1 = 6.5;
        Double boxedDouble = double1;
        char char1 = 'A';
        Character boxedChar = char1;

        Integer intToUnbox = 62;
        int unboxedInt = intToUnbox.intValue();
        Double doubleToUnbox = 66.5;
        double unboxedDouble = doubleToUnbox.doubleValue();
        Character characterToUnbox = 'B';
        char unboxedChar = characterToUnbox.charValue();

        System.out.println(intSum(int1, unboxedInt));
        charPrinter(unboxedChar);
        System.out.println(integerSum(boxedInt, intToUnbox));
        characterPrinter(boxedChar);

    }

    public static int intSum (int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static void charPrinter (char arg1) {
        System.out.println(arg1);
    }

    public static Integer integerSum (Integer arg1, Integer arg2) {
        return arg1 + arg2;
    }

    public static void characterPrinter (Character arg1) {
        System.out.println(arg1);
    }

}

//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//Scrivere una funzione che accetti in input 1 char lo stampi
//Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//Scrivere una funzione che accetti in input 1 Character lo stampi
//Scrivere un un valore primitivo per int, double e char e fare autoboxing
//Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//Usare le funzioni scritte con i valori creati

//Riprendi uno degli esercizi già svolti e corretti
//Aggiungi Junit al progetto
//Crea una funzione di test che non dia errori