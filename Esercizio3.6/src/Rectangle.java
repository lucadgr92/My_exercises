public class Rectangle extends Shape {
    public Rectangle(double width, double height, ShapeCheck tipo) {
        super(width, height, tipo);
    }
    double calcolaArea () {
        return this.width * this.height;
    }

}
