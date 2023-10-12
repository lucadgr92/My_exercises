public class Triangle extends Shape {
    public Triangle(double a, double b) {
        this.width = a;
        this.height = b;
    }

    public double calcolaArea() {
        return (width * height) / 2;
    }
}
