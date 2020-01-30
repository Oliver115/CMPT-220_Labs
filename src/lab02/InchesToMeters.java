package lab02;
import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {

        // Constant
        final double METERS_PER_INCH = 0.0254;

        // Prompt user for distance in inches
        System.out.println("Enter distance in inches: ");
        Scanner input = new Scanner(System.in);
        double inches = input.nextDouble();

        // Calculate the result
        double result = (inches * METERS_PER_INCH);

        // Show results
        System.out.println((int)(inches) + " Inches is " + (int)(result) + " Meters!");
    }
}
