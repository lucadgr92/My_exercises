public class ShapeCheck {

    public enum Type {
        TRIANGLE,
        RECTANGLE;


    }
    public String shapeVerifier(Shape object1) {
        switch (object1.getTipo()) {
            case Type.TRIANGLE:
                return "The shape is a triangle.";
            case Type.RECTANGLE:
                return "The shape is a rectangle.";
            default:
                return "The shape is unknown.";
        }
    }
}