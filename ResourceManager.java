/*17-03-26 Write a program to calculate average of numbers 
using try-catch and ensure resource cleanup using finally block.*/

import java.util.Scanner;
import java.util.InputMismatchException;

class ResourceManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, n, num;

        try {
            System.out.print("How many numbers? ");
            n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                num = scanner.nextInt();
                sum += num;
            }

            double avg = (double) sum / n;
            System.out.println("Average = " + avg);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");

        } finally {
            System.out.println("Scanner resource released");
            scanner.close();
        }
    }
}