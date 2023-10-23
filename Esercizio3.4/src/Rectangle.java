public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double calcoloArea () {
        return this.width * this.height;
    }
}
