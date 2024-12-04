

abstract class Shape  {
    protected int r1;
    protected int r2;

    public Shape(int r1, int r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
    public abstract double area();
    public abstract double perimeter();
}

class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }
    public double area() {
        return r1 * r2; 
    }
    public double perimeter() {
        return 2 * (r1 + r2);         	
    }
    }

class Triangle extends Shape {
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        super(side1, side2);
        this.side3 = side3;
    }

    public double area() {
        
        double s = perimeter() / 2.0; 
        return Math.sqrt(s * (s - r1) * (s - r2) * (s - side3));
    }
    public double perimeter() {
        return r1 + r2 + side3; 
    }
      }

class Circle extends Shape {
 
    public Circle(int radius) {
        super(radius, 0); 
    }
    public double area() {
        return Math.PI * r1 * r1; 
    }
    public double perimeter() {
        return 2 * Math.PI * r1; 
    }
 }

public class shapeabstract {
    public static void main(String[] args) {
    
        Shape rectangle = new Rectangle(7, 3);
        rectangle.area();
        rectangle.perimeter();
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Shape triangle = new Triangle(10, 9, 6);
        System.out.println("\nTriangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        Shape circle = new Circle(8);
        System.out.println("\nCircle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
    }
}

