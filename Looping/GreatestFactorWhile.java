import java.util.Scanner;

// Program: GreatestFactorWhile
// Purpose: Greatest factor (besides itself) using while loop
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Greatest factor = 1");
            input.close();
            return;
        }

        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor of " + number + " (besides itself) = " + greatestFactor);
        input.close();
    }
}
