package week2;

public abstract class circle {
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void display () {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class Circle extends derived {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();
    }
}
