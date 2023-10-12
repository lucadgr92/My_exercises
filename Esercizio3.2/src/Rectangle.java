public class Rectangle extends Shape{
    public Rectangle(double width, double height) {
        super(width, height);
    }
    @Override
    public double calcolaArea() {
        return this.height * this.width;
    }

}
