import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Mario", 14);
        Student student2 = new Student("Walter", 16);
        Student student3 = new Student("Massimo", 16);
        Student student4 = new Student("Piero", 15);
        Student student5 = new Student("Nichi", 18);
        Student student6 = new Student("Nilde", 14);
        Student student7 = new Student("Palmiro", 18);
        Student student8 = new Student("Bettino", 18);
        Student student9 = new Student("Roberto", 16);
        Student student10 = new Student("Sandro", 15);
        Student student11 = new Student("Luigi", 15);
        Student student12 = new Student("Eleonora", 17);

        ArrayList<Student> scuola = new ArrayList<>();

        scuola.add(student1);
        scuola.add(student2);
        scuola.add(student3);
        scuola.add(student4);
        scuola.add(student5);
        scuola.add(student6);
        scuola.add(student7);
        scuola.add(student8);
        scuola.add(student9);
        scuola.add(student10);
        scuola.add(student11);
        scuola.add(student12);

        for(int i = 0; i < scuola.size(); i++) {
            System.out.println(scuola.get(i));
        }

        scuola.sort(Comparator.comparing(Student::getAge));
        //Ordinando la collection per età degli studenti.

        for(int i = 0; i < scuola.size(); i++) {
            System.out.println(scuola.get(i));
        }

        scuola.sort(Comparator.comparing(Student::getName));
        //Ordinando la collection per ordine alfabetico del nome degli studenti.

        for(int i = 0; i < scuola.size(); i++) {
            System.out.println(scuola.get(i));
        }


    }
}

//Creare una classe Student che accetti nel costruttore il parametro name
// (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//mettere in ordine la collezione e stampare il risultato