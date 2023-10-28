import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer myInteger = 43;
        HashSet<Integer> myHashSet = new HashSet<>();
        System.out.println(hashSetFiller(myHashSet));
        System.out.println(hashSetFilter(myHashSet,myInteger));
        hashSetEmpty(myHashSet);
    }

    public static HashSet<Integer> hashSetFiller (HashSet<Integer> hash1) {
        Random r = new Random();
        while(hash1.size() < 10) {
            hash1.add(r.nextInt(1,300));
        }
        return hash1;
    }

    public static HashSet<Integer> hashSetFilter (HashSet<Integer> hash1, Integer arg1) {
        Iterator<Integer> iterator = hash1.iterator();
        while(iterator.hasNext()) {
            Integer number = iterator.next();

            if(Objects.equals(number, arg1)) {
                iterator.remove();
                System.out.println("Il numero desiderato è stato rimosso.");
            }
        }
        return hash1;
    }

    public static void hashSetEmpty (HashSet<Integer> hash1) {
        hash1.clear();
        if(hash1.isEmpty()) {
            System.out.println("L'HashSet è stato svuotato.\nHashSet svuotato: " + hash1);
        }
    }

}

//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto
//creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato