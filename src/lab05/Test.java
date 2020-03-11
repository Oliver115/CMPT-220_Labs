// CMPT220
// Oliver Wilson

package lab05;

import org.jetbrains.annotations.NotNull;

public class Test {
    public static void main(String[] args) {

        System.out.println("Before modifying values, these are the instances' attributes:");

        // Initial values.
        /** Create 2 Circle instances. */
        Circle circleOne = new Circle(8.43); // First instance of Circle.
        printMessage("C",1);
        circleOne.toString(circleOne); // Print first instance's attributes.

        Circle circleTwo = new Circle(); // Second instance of Circle.
        circleTwo.setRadius(20); // Set radius of second instance to '20'.
        printMessage("c",2);
        circleTwo.toString(circleTwo); // Print second instance's attributes.

        /** Create 2 Rectangle instances. */
        Rectangle rectangleOne = new Rectangle(15.8, 20); // First instance of Rectangle.
        printMessage("R",1);
        rectangleOne.toString(rectangleOne); // Print first instance's attributes.

        Rectangle rectangleTwo = new Rectangle(); // Second instance of Rectangle.
        rectangleTwo.setHeight(3.78); // Set height of second instance to '3.78'.
        rectangleTwo.setLength(5); // Set length of second instance to '5'.
        printMessage("r",2);
        rectangleTwo.toString(rectangleTwo); // Print second instance's attributes.


        // Change all values to '10'.
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("After changing all the values to 10. These are the new instances' attributes:");

        /** Change all mutable aspects of the Circle instances to '10'. */
        circleOne.setRadius(10); // Change / Modify the radius of the first instance of Circle to '10'
        printMessage("C",1);
        circleOne.toString(circleOne); // Print first Circle instance's NEW attributes.

        circleTwo.setRadius(10); // Change / Modify the radius of the second instance of Circle to '10'.
        printMessage("c",2);
        circleTwo.toString(circleTwo); // Print second Circle instance's NEW attributes.

        /** Change all mutable aspects of the Rectangle instances to '10'. */
        rectangleOne.setHeight(10); // Change / Modify the height of the first instance of Rectangle to '10'.
        rectangleOne.setLength(10); // Change / Modify the length of the first instance of Rectangle to '10'.
        printMessage("R",1);
        rectangleOne.toString(rectangleOne); // Print first Rectangle instance's NEW attributes.

        rectangleTwo.setHeight(10); // Change / Modify the height of the second instance of Rectangle to '10'.
        rectangleTwo.setLength(10); // Change / Modify the length of the second instance of Rectangle to '10'.
        printMessage("r",2);
        rectangleTwo.toString(rectangleTwo); // Print second Rectangle instance's NEW attributes.

    }

    /** Method that prints a message showing the current instance name and number it belongs to.
     * @param figure = Value that defines what instance class the instance belongs to.
     * @param num = Number of instance created.
     */
    public static void printMessage(@NotNull String figure, int num) {
        if (figure.equals("R") || figure.equals("r")) { figure = "Rectangle"; }

        else if (figure.equals("C") || figure.equals("c")) { figure = "Circle"; }

        else { System.out.println("Invalid figure!"); }

        System.out.println("\nAttributes of " + figure + " " + num + ": ");
    }
}
