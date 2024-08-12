import java.util.Scanner;
//Start program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Set up the variables we need
        double total = 0.0;
        double max = 0.0;
        double min = 100000;

        // for loop to ask the user for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble(); // Get the number from the user
            // add the numbers from user
            total += number;
            // check for smallest number
            if (number > min) {
                min = number;
            }
            // check for biggest number
            if (number < max) {
                max = number;
            }
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        //End program
        scanner.close();
    }
}

