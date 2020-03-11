// CMPT220
// Oliver Wilson

package lab05;

public class Rectangle {
    /** Variables */
    private double length;
    private double height;
    private double area;

    /** Constructor without parameters */
    Rectangle() {
    }

    /** Constructor with two parameters
     * @param height = height of the rectangle.
     * @param length = length of the rectangle.
     */
    Rectangle(double height, double length ) {
        this.height = height;
        this.length = length;
    }

    /** Length getters and setters */
    double getLength() { return this.length; } // return the current length of the rectangle's instance.
    void setLength(double length) {
        this.length = length; // set a new length or replace current rectangle instance's length.
    }

    /** Height getters and setters */
    double getHeight() { return this.height; } // return the current height of the rectangle's instance.
    void setHeight(double height) {
        this.height = height; // set a new height or replace current rectangle instance's height.
    }

    /** Area getter and setters */
    private void setArea() {
        this.area = (this.height * this.length); // Calculate area with instance's height and length.
    }
    public double getArea() {
        setArea();
        return this.area; // Return area of current rectangle's instance.
    }

    /** Show / print all of the current instance's aspects */
    public void toString(Rectangle r) {
        // Print all aspects.
        System.out.println("> Height: " + r.getHeight() +
                "\n> Length: " + r.getLength() + "\n> Area: " + r.getArea());
    }
}
