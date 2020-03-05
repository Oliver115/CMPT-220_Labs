package lab05;

public class Rectangle {
    private double length;
    private double height;
    private double area;

    Rectangle(double height, double length ) {
        this.height = height;
        this.length = length;
    }

    // Length
    double getLength() {
        return this.length;
    }
    void setLength(double length) {
        this.length = length;
    }

    // Height
    double getHeight() {
        return this.height;
    }
    void setHeight(double height) {
        this.height = height;
    }

    // Area
    private void setArea() {
        this.area = (this.height * this.length);
    }
    public double getArea() {
        setArea();
        return this.area;
    }

    public void toString(Rectangle r) {
        System.out.println("> Height: " + r.getHeight() +
                "\n> Length: " + r.getLength() + "\n> Area: " + r.getArea());
    }
}
