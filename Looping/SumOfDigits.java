import java.util.Scanner;

// Purpose: Sum all digits of a user-provided integer using a while loop
class SumOfDigits {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read number
        int origNumber = input.nextInt();

        // Copy of number for processing; accumulator for sum
        int number = origNumber;
        int sum = 0;

        // Extract digits and accumulate
        while (number != 0) {
            int digit = number % 10; // last digit
            sum += digit;            // add to sum
            number = number / 10;    // remove last digit
        }

        // Print result
        System.out.println("The sum of digit of number: " + origNumber + " = " + sum);

        // Close scanner
        input.close();
    }
}
