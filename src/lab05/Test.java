package lab05;

import org.jetbrains.annotations.NotNull;

public class Test {
    public static void main(String[] args) {

        System.out.println("Before modifying values these are the instances' attributes:");

        // Initial values
        // Create 2 Circle instances
        Circle circleOne = new Circle(8.43);
        printMessage("C",1);
        circleOne.toString(circleOne);

        Circle circleTwo = new Circle();
        circleTwo.setRadius(20);
        printMessage("c",2);
        circleTwo.toString(circleTwo);

        // Create 2 Rectangle instances
        Rectangle rectangleOne = new Rectangle(15.8, 20);
        printMessage("R",1);
        rectangleOne.toString(rectangleOne);

        Rectangle rectangleTwo = new Rectangle();
        rectangleTwo.setHeight(3.78);
        rectangleTwo.setLength(5);
        printMessage("r",2);
        rectangleTwo.toString(rectangleTwo);


        // Change all values to '10'.
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("After changing all the values to 10. These are the new instances' attributes:");

        circleOne.setRadius(10);
        printMessage("C",1);
        circleOne.toString(circleOne);

        circleTwo.setRadius(10);
        printMessage("c",2);
        circleTwo.toString(circleTwo);

        rectangleOne.setHeight(10);
        rectangleOne.setLength(10);
        printMessage("R",1);
        rectangleOne.toString(rectangleOne);

        rectangleTwo.setHeight(10);
        rectangleTwo.setLength(10);
        printMessage("r",2);
        rectangleTwo.toString(rectangleTwo);

    }

    public static void printMessage(@NotNull String figure, int num) {
        if (figure.equals("R") || figure.equals("r")) {
            figure = "Rectangle";
        }
        else if (figure.equals("C") || figure.equals("c")) {
            figure = "Circle";
        }
        else {
            System.out.println("Invalid figure!");
        }
        System.out.println("\nAttributes of " + figure + " " + num + ": ");
    }
}
