package lab05;

public class Circle {

    private double radius;
    private double area;

    Circle(double radius) {
        this.radius = radius;
    }

    // Radius
    double getRadius() {
        return this.radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }

    // Area
    private void setArea() {
        this.area = (radius * radius * Math.PI);
    }
    public double getArea() {
        setArea();
        return this.area;
    }

    public void toString(Circle c) {
        System.out.println("> Radius: " + c.getRadius() + "\n> Area: " + c.getArea());
    }

    public static void main(String[] args) {

    }
}
