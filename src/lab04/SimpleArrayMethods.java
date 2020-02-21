// CMPT220
// Oliver Wilson

package lab04;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleArrayMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;

        System.out.println("This program will demonstrate examples of one dimensional array methods");
        System.out.println("Enter '10' numbers for the array: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }
        System.out.println("The array is: " + Arrays.toString(array) + "\n");
        System.out.println("Amount of even values: " + countEven(array));
        System.out.println("Values above the average: " + countAboveAverage(array));
        System.out.println("Amount of positive values: " + countPositiveNumbers(array));
        System.out.println("The largest value is: " + getLargest(array));
        System.out.println("The smallest value is: " + getSmallest(array));
    }
    /**
     * Method that calculates the amount of even values in the array.
     * @param list = Array that includes int values.
     * @return the amount of even numbers in the array.
     */
    public static int countEven(int[] list) {
        int amountOfEvens = 0;
        for (int i = 0; i < list.length; i++) {
            int evenOrNot = (list[i] % 2);
            if (evenOrNot == 0) {
                amountOfEvens += 1;
            }
        }
        return amountOfEvens;
    }

    /**
     * Method that computes the average of all int values in the array and
     * calculates the amount of values that are above the computed average.
     * @param list = Array that includes int values.
     * @return the amount of values above the calculated average.
     */
    public static int countAboveAverage(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        int average = sum / list.length;
        int countAboveAverage = 0;  // The number of elements above the average
        for (int i = 0; i < list.length; i++) {
            if (list[i] > average)
                countAboveAverage++;
        }
        return countAboveAverage;
    }

    /**
     * Method that calculates the amount of positive int values in the array.
     * @param list = Array that includes int values.
     * @return the amount of values that are positive.
     */
    public static int countPositiveNumbers(int[] list) {
        int sumAboveZero = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0) {
                sumAboveZero += 1;
            }
        }
        return sumAboveZero;
    }

    /**
     * Method that finds the largest value in the array.
     * @param list = Array that includes that int values.
     * @return the largest value in the array.
     */
    public static int getLargest(int[] list) {
        int largestNum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > largestNum) {
                largestNum = list[i];
            }
        }
        return largestNum;
    }

    /**
     * Method that finds the smallest value in the array.
     * @param list = Array that includes int values.
     * @return the smallest value in the array.
     */
    public static int getSmallest(int[] list) {
        int smallestNum = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < smallestNum) {
                smallestNum = list[i];
            }
        }
        return smallestNum;
    }
}

