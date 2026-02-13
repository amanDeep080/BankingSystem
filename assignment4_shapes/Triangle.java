package assignment4_shapes;

public class Triangle extends Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("All sides must be > 0");
        }

        // Triangle inequality rule
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalArgumentException("Invalid triangle sides (triangle inequality violated).");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // "getSide() methods" -> provide getters for each side
    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        // Heron's formula
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
