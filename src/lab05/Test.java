package lab05;

public class Test {
    public static void main(String[] args) {

        System.out.println("Before modifying values these are the attributes:");

        // Initial values
        Circle circleOne = new Circle(8.43);
        System.out.println("\nAttributes of Circle 1:");
        circleOne.toString(circleOne);

        Circle circleTwo = new Circle(20);
        System.out.println("\nAttributes of Circle 2:");
        circleTwo.toString(circleTwo);

        Rectangle rectangleOne = new Rectangle(15.8, 20);
        System.out.println("\nAttributes of Rectangle 1:");
        rectangleOne.toString(rectangleOne);

        Rectangle rectangleTwo = new Rectangle(19.01, 19);
        System.out.println("\nAttributes of Rectangle 2:");
        rectangleTwo.toString(rectangleTwo);

        // Change all values to '10'.
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("After changing all the values to 10. These are the new attributes:");

        circleOne.setRadius(10);
        System.out.println("\nAttributes of Circle 1:");
        circleOne.toString(circleOne);

        circleTwo.setRadius(10);
        System.out.println("\nAttributes of Circle 2:");
        circleTwo.toString(circleTwo);

        rectangleOne.setHeight(10);
        rectangleOne.setLength(10);
        System.out.println("\nAttributes of Rectangle 1:");
        rectangleOne.toString(rectangleOne);

        rectangleTwo.setHeight(10);
        rectangleTwo.setLength(10);
        System.out.println("\nAttributes of Rectangle 2:");
        rectangleTwo.toString(rectangleTwo);

    }
}
