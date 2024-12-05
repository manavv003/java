

interface Shape {
    double area();      
    double perimeter(); 
    	
}


class Rectangle implements Shape {
    private double length;
    private double breadth;
  
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    } 
    public double area() {
        return length * breadth; 
        
    }
    public double perimeter() {
        return 2 * (length + breadth); 
        	
    }
}

class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

  
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double area() {
       
        double s = perimeter() / 2; 
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double perimeter() {
        return side1 + side2 + side3;         	
    }
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

public class shapedemo {
    public static void main(String[] args) {
       
        Shape rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        Shape circle = new Circle(70);
        System.out.println("\nCircle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
    }
}

