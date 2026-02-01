import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int inc_number;
        int exc_number;
        int count;


        System.out.println("Welcome to Random Number Generator\n\n");

        System.out.println("What would be the number range would you like us to generate\n");

        System.out.print("Enter number from (this number will be inclusive): ");
        inc_number = scanner.nextInt();

        System.out.print("Enter number from (this number will be exclusive): ");
        exc_number = scanner.nextInt();

        System.out.print("How many numbers between " + inc_number + " and " + exc_number + " would you like to generate?: ");
        count = scanner.nextInt();

        System.out.println("\n");
        for (int i = 0; i < count; i++) {
            int num = random.nextInt(inc_number, exc_number);
            System.out.println("Random Number: " + num);
        }




    }
}
