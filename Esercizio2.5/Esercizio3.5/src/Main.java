import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> hashMap1 = new HashMap<>();

        hashMap1.put("Norma", 32);
        hashMap1.put("Eleonora", 26);
        hashMap1.put("Margherita", 28);
        hashMap1.put("Marta", 29);

        ArrayList<Integer>myValues = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            myValues.add(value);
        }

        Collections.sort(myValues);

        for(int i = 0; i < myValues.size(); i++) {
            System.out.println(myValues.get(i));
        }

         }

    }
//Creare un hashmap prendere tutti i valori, ordinarli e stamparli