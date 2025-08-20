import java.util.Scanner;

// Program: GreatestFactorFor
// Purpose: Find greatest factor of a number (besides itself) using for loop
class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Greatest factor = 1");
            input.close();
            return;
        }

        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor of " + number + " (besides itself) = " + greatestFactor);
        input.close();
    }
}
