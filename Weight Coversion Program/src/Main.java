import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("Welcome to the weight coversion program!");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("1: Convert kgs to lbs");

        // prompt for choice
        System.out.print("choose an option: ");
        choice = scanner.nextInt();

        // option 1 convert lbs to kgs
        if(choice == 1) {
            System.out.println("Please enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.45
        }

        // option 2 convert kgs to lbs

        // else print not a valid choice

    }
}
