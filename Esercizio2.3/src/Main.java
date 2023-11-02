import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Fruit frutto1 = new Fruit("Mela");
        Fruit frutto2 = new Fruit("Melograno");
        Fruit frutto3 = new Fruit("Melacotogna");
        Fruit frutto4 = new Fruit("Pera");

        LinkedList<Fruit> orchard = new LinkedList<>();

        orchard.add(frutto1);
        orchard.add(frutto2);
        orchard.add(frutto3);
        orchard.add(frutto4);

        for(int i = 0; i < orchard.size(); i++) {
            System.out.println(orchard.get(i));
        }

        Fruit frutto5 = new Fruit("Banana");
        Fruit frutto6 = new Fruit("Ciliegia");

        orchard.addFirst(frutto5);
        orchard.addLast(frutto6);


        for(int i = 0; i < orchard.size(); i++) {
            System.out.println(orchard.get(i));
        }
    }
}

//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata