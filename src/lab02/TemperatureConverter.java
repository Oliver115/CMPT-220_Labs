// CMPT220
// Oliver Wilson

package lab02;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner

        // Description of Program
        System.out.println("Enter 'F' for Fahrenheit or 'C' for Celsius\n Example: 35F or 56C ");
        System.out.println("\nEnter temperature you want to convert: ");
        String initialTemperature = input.next();

        // Temperature Converter from Fahrenheit to Celsius
        if (initialTemperature.endsWith("F")) {

            int length = (initialTemperature.length() - 1);
            initialTemperature = initialTemperature.substring(0, length);
            double temperatureInFahrenheit = Double.parseDouble(initialTemperature); // Converts string initialTemperature into an integer

            // Convert Fahrenheit to Celsius
            double celsius = (5.0 / 9) * (temperatureInFahrenheit - 32);
            System.out.println(temperatureInFahrenheit + " degrees Fahrenheit is: " + (int)(celsius) + " degrees Celsius");
        }
        // Temperature Converter from Celsius to Fahrenheit
        else if (initialTemperature.endsWith("C")) {

            int length = (initialTemperature.length() -1);
            initialTemperature = initialTemperature.substring(0, length);
            double temperatureInCelsius = Double.parseDouble(initialTemperature); // Converts string initialTemperature into an integer

            // Convert Celsius to Fahrenheit
            double fahrenheit = (temperatureInCelsius * 9.0 / 5) + (32);
            System.out.println(temperatureInCelsius + " degrees Celsius is: " + (int)(fahrenheit) + " degrees Fahrenheit");
        }
        else
            System.out.println("Please enter a valid input!");
    }
}

