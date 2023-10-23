public class Triangle extends Shape{
    public Triangle(double width, double height, ShapeCheck.Type tipo) {
        super(width, height, tipo);
    }
    double calcolaArea () {
        return (this.getWidth() * this.getHeight()) / 2;
    }
}
