import java.util.Scanner;

// Program: PowerWhile
// Purpose: Compute number^power using a while loop with counter
class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();

        if (power < 0) {
            System.out.println("Power must be non-negative for this program.");
            input.close();
            return;
        }

        long result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(number + "^" + power + " = " + result);
        input.close();
    }
}
