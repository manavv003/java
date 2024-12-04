public class circle {
    private double x, y;  
    private double r;     

    public circle() {
        this.x = 0;
        this.y = 0;
        this.r = 1;
    }

    public circle(double r) {
        this.x = 0;
        this.y = 0;
        this.r = r;
    }

    public circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double circumference() {
        return 2 * Math.PI * r;  
    }

    public double diameter() {
        return 2 * r;  
    } 

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    public static void main(String[] args) {
        circle circle1 = new circle();
        System.out.println("Circle 1:");
        System.out.println("Area: " + circle1.area());
        System.out.println("Circumference: " + circle1.circumference());
        System.out.println("Diameter: " + circle1.diameter());

        
    }
}
