package lab03;
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner

        // User enters a year
        System.out.print("Enter a year to calculate Chinese Zodiac sign: ");
        int userYear = input.nextInt();

        switch (userYear % 12) {
            case 0: System.out.println(userYear + " is: Monkey");
                break;
            case 1: System.out.println(userYear + " is: Rooster");
                break;
            case 2: System.out.println(userYear + " is: Dog");
                break;
            case 3: System.out.println(userYear + " is: Pig");
                break;
            case 4: System.out.println(userYear + " is: Rat");
                break;
            case 5: System.out.println(userYear + " is: Ox");
                break;
            case 6: System.out.println(userYear + " is: Tiger");
                break;
            case 7: System.out.println(userYear + " is: Rabbit");
                break;
            case 8: System.out.println(userYear + " is: Dragon");
                break;
            case 9: System.out.println(userYear + " is: Snake");
                break;
            case 10: System.out.println(userYear + " is: Horse");
                break;
            case 11: System.out.println(userYear + " is: Sheep");
                break;

            default: System.out.println("Error! Please try again"); // In case of error
        }
    }
}

