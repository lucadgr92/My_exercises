import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> hashMap1 = new HashMap<>();

        hashMap1.put("Norma", 32);
        hashMap1.put("Eleonora", 26);
        hashMap1.put("Margherita", 28);
        hashMap1.put("Marta", 29);

        ArrayList<Integer> age = new ArrayList<>();
        for(Integer value : hashMap1.values()) {
            age.add(value);
        }

        Collections.sort(age);

        System.out.println(age);


    }
}
//Creare un hashmap prendere tutti i valori, ordinarli e stamparli