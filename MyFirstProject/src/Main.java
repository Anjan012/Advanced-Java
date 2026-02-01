import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Single Line comments

        /* Multiline Comment
        System.out.print("hello \n");
        System.out.print("world");
         */
//        System.out.println("loving can hurt");
//        System.out.println("loving can hurt sometime");
//        System.out.println("But it's the only thing that makes us feel alive");

        // Variables -------------------------

        // primitive = Simple value that stored directly in memory (stack)
        // reference = memory address (stack) that points to the (heap)

        // primitive = int | double | char | boolean
        // reference = string | array | object

//        int number = 45;
//        int age = 22;
//        int year = 2026;
//
//        System.out.println(number);
//        System.out.println("The year is " + year);
//
//        double price = 30.45;
//        double gpa = 3.8;
//        double temperature = -12.5;
//
//        System.out.println("$ " + price);
//
//        char grade = 'A';
//        char symbol = '1';
//        char currency = '$';
//
//        boolean isStudent = true;
//        boolean isOnline = false;
//        boolean forSale = true;
//
//        // char uses ''
//        // String uses ""
//
//        String name = "Anjan";
//        String email = "fake@gmail.com";
//        String car = "Mustang";
//        String color = "Black";
//        System.out.println("The name is " + name); // String concat
//        System.out.println("Email " + email);
//        System.out.println("GPA " + gpa);
//        System.out.println("Grade " + grade);
//        System.out.println("Car " + car);
//        System.out.println("color " + color);

//        User Input ----------------------------------------------

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter Your Name: ");
////        String name = scanner.next(); // input : Anjan khadka returns Anjan
//        String name = scanner.nextLine(); // nextline reads after space also but not next input : Anjan khadka returns Anjan khadka
//
//        System.out.print("Enter Your Age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Enter Your GPA: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("hello "+ name);
//        System.out.println("You are  "+ age + " years old");
//        System.out.println("You are  "+ gpa);
//
//        if(isStudent) {
//            System.out.println("You are a student");
//        }else {
//            System.out.println("You are not a student");
//        }
//
////        use scanner.nextLine() when you are accepting string after number


        // calculate the area of rectangle

        System.out.print("Enter the Length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        System.out.println("Area of rectangle is: " + area + "cm²");

        scanner.close(); // good practice
    }
}
