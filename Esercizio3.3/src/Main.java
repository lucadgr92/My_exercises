
public class Main {
    public static void main(String[] args) {
       Rectangle rectangle1 = new Rectangle(4, 7);
       System.out.println("L'area del rettangolo è " + rectangle1.calcolaArea());
       Triangle triangle1 = new Triangle(10, 8);
       System.out.println("L'area del triangolo è " + triangle1.calcolaArea());
    }
}