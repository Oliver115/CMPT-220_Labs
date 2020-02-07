// CMPT220
// Oliver Wilson

package lab03;

public class NestedLoops {
    /**
     * main method to test implementation for the convert method
     * @param args
     */
    public static void main(String[] args) {

        int controlValue = 5;
        for (int count1 = 1; controlValue >= 1; count1++) {
            int number = 1;
            for (int count2 = 1; count2 <= controlValue; count2++) {
                System.out.print(number + "   ");
                number++;
            }
            number -= 1;
            controlValue--;
            System.out.println();
        }
        controlValue = 1;
        for (int count3 = 1; controlValue <= 4; count3++) {
            int number = 1;
            for (int count4 = 0; count4 <= controlValue; count4++) {
                System.out.print(number + "   ");
                number++;
            }
            controlValue++;
            System.out.println();
        }
    }
}

