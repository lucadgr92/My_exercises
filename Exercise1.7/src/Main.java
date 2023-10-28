import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> intSet = new HashSet<>();
        System.out.println("Elementi HashSet " + hashSetFiller(intSet));
        System.out.println("Grandezza HashSet " + intSet.size() + " elementi.");
    }

    public static HashSet<Integer> hashSetFiller (HashSet<Integer> hash1) {
        Random r = new Random();
        while (hash1.size() < 10) {
            hash1.add(r.nextInt(1,100));
        }
        return hash1;
    }
}





// Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi