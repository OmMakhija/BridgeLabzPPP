import java.util.Scanner;

// Program: AbundantNumber
// Purpose: Sum all proper divisors (1..n-1) and compare with n.
class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Not applicable for non-positive numbers");
            input.close();
            return;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is NOT an Abundant Number");
        }

        input.close();
    }
}
