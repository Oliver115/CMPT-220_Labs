// CMPT220
// Oliver Wilson

package lab03;

public class SimpleLoop {
    /**
     * main method to test implementation for the convert method
     * @param args
     */
    public static void main(String[] args) {

        int num = 0; // first number is set at '0'

        for (int count = 0; count <= 50; count++) { // Print every number from 0-50
            System.out.println(num); // prints 'num'
            num++; // increases 'num' by 1
        }
    }
}
