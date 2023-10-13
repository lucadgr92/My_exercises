public class Triangle implements Shape {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcoloArea() {
        return (this.width * this.height) / 2;
    }
}
