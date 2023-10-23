public class Shape {
    private double width;
    private double height;
    ShapeCheck.Type tipo;
    public Shape(double width, double height, ShapeCheck.Type tipo) {
        this.width = width;
        this.height = height;
        this.tipo = tipo;
    }

    public ShapeCheck.Type getTipo() {
        return tipo;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    double calcolaArea () {
        double area = 0;
        return area;
    }
}
