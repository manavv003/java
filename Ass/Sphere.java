package org.gvp.dcs.shapes;

public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public void display() {
        System.out.printf("Sphere - Radius: %.2f, Surface Area: %.2f, Volume: %.2f%n", 
                           radius, getSurfaceArea(), getVolume());
    }
}
