public class Triangle extends Shape {
    public Triangle(double width, double height) {
        super(width, height);
    }
    @Override
    double calcoloArea() {
        return (this.width * this.height) / 2;
    }
}
