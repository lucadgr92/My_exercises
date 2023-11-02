import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Marco", 17);
        Student student2 = new Student("Piero", 14);
        Student student3 = new Student("Lucia", 14);
        Student student4 = new Student("Anna", 19);

        ArrayList<Student> scuola = new ArrayList<>();

        scuola.add(student1);
        scuola.add(student2);
        scuola.add(student3);
        scuola.add(student4);

        for(int i = 0; i < scuola.size(); i++) {
            System.out.println(scuola.get(i));
        }

        Student student5 = new Student("Gianfranco", 16);
        Student student6 = new Student("Silvio", 15);
        Student student7 = new Student("Pierferdinando", 16);
        Student student8 = new Student("Umberto", 18);

        scuola.add(student5);
        scuola.add(student6);
        scuola.add(student7);
        scuola.add(student8);


        for(int i = 0; i < scuola.size(); i++) {
            System.out.println(scuola.get(i));
        }
    }
}

//Creare una classe Student che accenti nel costruttore il parametro name
// (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console