public enum ShapeCheck {
    TRIANGLE,
    RECTANGLE;
    public String shapeVerifier() {
        switch(this) {
            case TRIANGLE:
                return "The shape is a triangle.";
            case RECTANGLE:
                return "The shape is a rectangle.";
            default:
                return "The shape is unknown.";
        }
    }
}
