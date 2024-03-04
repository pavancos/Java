interface Shape {
    double area();
    double perimeter();
}
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
}
public class Sample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Perimeter of Circle: " + circle.perimeter());
        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
    }
}
