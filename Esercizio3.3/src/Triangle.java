public class Triangle extends Shape {
    public Triangle(double width, double height) {
        super(width, height);
    }
    public double calcolaArea() {
        return (width * height) / 2;
    }
}
