import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> hashMap1 = new HashMap<>();

        hashMap1.put("Norma", 32);
        hashMap1.put("Eleonora", 26);
        hashMap1.put("Margherita", 28);
        hashMap1.put("Marta", 29);

        for(Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }

        Map<String, Integer> hashMap2 = Map.of("Norma", 32, "Eleonora", 26, "Margherita", 28, "Marta", 29);


        for(Map.Entry<String, Integer> entry : hashMap2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }

        Map<String, Integer> hashMap3 = Map.ofEntries(
                Map.entry("Norma", 32),
                Map.entry("Eleonora", 26),
                Map.entry("Margherita", 28),
                Map.entry("Marta", 29)
        );


        for(Map.Entry<String, Integer> entry : hashMap3.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }

      }
}

//Creare 3 hashmap con 3 differenti
// metodi di inizializzazione e stampare il contenuto.