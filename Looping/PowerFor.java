import java.util.Scanner;

// Program: PowerFor
// Purpose: Compute number^power using a for loop
class PowerFor {
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
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + "^" + power + " = " + result);
        input.close();
    }
}
