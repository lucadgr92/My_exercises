public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(25,37, ShapeCheck.Type.RECTANGLE);
        Triangle triangle1 = new Triangle(53,64, ShapeCheck.Type.TRIANGLE);
        ShapeCheck sh = new ShapeCheck();

        System.out.println(sh.shapeVerifier(rectangle1));
        System.out.println(sh.shapeVerifier(triangle1));
    }
}

// Scrivere un programma che contenga una classe chiamata Forma ed un
// metodo chiamato calcolaArea() che stampi l'area della forma specifica.
// Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che
// abbiano un tipo che ne identifichi la Forma in maniera univoca usando una enum.