package org.gvp.dcs.shapes;

public class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSurfaceArea() {
        return 6 * side * side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public void display() {
        System.out.printf("Cube - Side: %.2f, Surface Area: %.2f, Volume: %.2f%n", 
                           side, getSurfaceArea(), getVolume());
    }
}
