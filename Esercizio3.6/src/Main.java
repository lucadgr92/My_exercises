public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(25,37, ShapeCheck.RECTANGLE);
        Triangle triangle1 = new Triangle(53,64, ShapeCheck.TRIANGLE);

        System.out.println(rectangle1.tipo.shapeVerifier());
        System.out.println(triangle1.tipo.shapeVerifier());
    }
}

// Scrivere un programma che contenga una classe chiamata Forma ed un
// metodo chiamato calcolaArea() che stampi l'area della forma specifica.
// Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che
// abbiano un tipo che ne identifichi la Forma in maniera univoca usando una enum.