public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height);
    }
    @Override
    double calcoloArea () {
        return this.width * this.height;
    }
}
