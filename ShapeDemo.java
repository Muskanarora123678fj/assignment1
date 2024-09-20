abstract class Shape {
    // Abstract method to calculate area
    public abstract double area();
}

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override area method
    @Override
    public double area() {
        return width * height;
    }
}

class Square extends Rectangle {
    // Constructor
    public Square(double side) {
        super(side, side); // A square is a rectangle with equal sides
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        // Creating objects for each shape
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        // Displaying the area of each shape
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Square: " + square.area());
    }
}

