class Shape {
    public double calculateArea() {
        return 0; // Default implementation returns 0
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius; // Calculate area of circle
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {

        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class shapeCall {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle: " + circle.calculateArea());
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("Rectangle: " + rectangle.calculateArea());
        Triangle triangle = new Triangle(5, 6);
        System.out.println("Triangle: " + triangle.calculateArea());
    }
}
