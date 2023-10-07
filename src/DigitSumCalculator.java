/**
 * @class: DigitSumCalculator
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 6, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 *
 * Description:
 */

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        scanner.close();

        int originalNumber = number; // Store the original number for display
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the last digit to the sum
            number /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits of " + originalNumber + " is " + sum);
    }
}
