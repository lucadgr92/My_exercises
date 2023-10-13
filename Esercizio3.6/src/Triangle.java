public class Triangle extends Shape{
    public Triangle(double width, double height, ShapeCheck tipo) {
        super(width, height, tipo);
    }
    double calcolaArea () {
        return (this.width * this.height) / 2;
    }
}
