public class Rectangle extends Shape {
    public Rectangle(double width, double height, ShapeCheck.Type tipo) {
        super(width, height, tipo);
    }
    double calcolaArea () {
        return this.getWidth() * this.getHeight();
    }

}
