package lab02;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner

        // Description of Program
        System.out.println("Enter 'F' for Fahrenheit or 'C' for Celsius\n Example: 35F or 56C ");
        System.out.println("\nEnter temperature you want to convert: ");
        String temp = input.next();

        // Temperature Converter from Fahrenheit to Celsius
        if (temp.endsWith("F")) {

            int len = (temp.length() - 1);
            temp = temp.substring(0, len);
            double tempF = Double.parseDouble(temp); // Converts string temp into an integer

            // Convert Fahrenheit to Celsius
            double celsius = (5.0 / 9) * (tempF - 32);
            System.out.println(tempF + " degrees Fahrenheit is " + (int)(celsius) + " degrees Celsius");
        }
        // Temperature Converter from Celsius to Fahrenheit
        else if (temp.endsWith("C")) {

            int len = (temp.length() -1);
            temp = temp.substring(0, len);
            double tempC = Double.parseDouble(temp); // Converts string temp into an integer

            // Convert Celsius to Fahrenheit
            double fahrenheit = (tempC * 9.0 / 5) + (32);
            System.out.println(tempC + " degrees Celsius is " + (int)(fahrenheit) + " degrees Fahrenheit");
        }
        else
            System.out.println("Please enter a valid input!");
    }
}

