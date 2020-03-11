// CMPT220
// Oliver Wilson

package lab05;

public class Circle {
    /** Variables */
    private double radius;
    private double area;

    /** Constructor without parameters */
    Circle() {
    }

    /** Constructor with two parameters
     * @param radius = radius of the circle
     */
    Circle(double radius) {
        this.radius = radius;
    }

    /** Radius getters and setters */
    double getRadius() { return this.radius; } // return the current radius of the circle's instance.
    void setRadius(double radius) {
        this.radius = radius; // set a new radius or replace current rectangle instance's radius.
    }

    /** Area setters and getters */
    private void setArea() {
        this.area = (this.radius * this.radius * Math.PI); // Calculate area with instance's radius.
    }
    public double getArea() {
        setArea();
        return this.area; // Return area of current circle's instance.
    }

    /** Show / print all of the current instance's aspects */
    public void toString(Circle c) {
        // Print all aspects.
        System.out.println("> Radius: " + c.getRadius() + "\n> Area: " + c.getArea());
    }
}
