import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    HashSet<Integer> intHash = new HashSet<>();
    hashSetFiller(intHash);
    Integer myInteger = 74;
    System.out.println("Il mio HashSet contiene il mio oggetto Integer: " + intHash.contains(myInteger));
    }
    public static HashSet<Integer> hashSetFiller (HashSet<Integer> hash1) {
        Random r = new Random();
        while(hash1.size() < 20) {
            hash1.add(r.nextInt(1,200));
        }
        return hash1;
    }
}

//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato