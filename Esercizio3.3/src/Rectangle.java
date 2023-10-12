public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        this.width = a;
        this.height = b;
    }
    @Override
    public double calcolaArea() {
        return height * width;
    }

}
