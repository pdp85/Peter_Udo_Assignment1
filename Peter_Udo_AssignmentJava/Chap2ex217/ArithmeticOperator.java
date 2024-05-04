package Chap2ex217;
/*
 * (Arithmetic, Smallest and Largest) 
 * Write an application that inputs three integers 
 * from the user and displays the sum, average, product, 
 * smallest and largest of the numbers
 */
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Close the scanner after input
        scanner.close();

        // Calculate sum, average, and product
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        int product = num1 * num2 * num3;

        // Find the smallest number
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Find the largest number
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Display results
        System.out.printf("Sum: " + sum);
        System.out.printf("Average: " + average);
        System.out.printf("Product: " + product);
        System.out.printf("Smallest: " + smallest);
        System.out.printf("Largest: " + largest);
    }//main close
}//class close