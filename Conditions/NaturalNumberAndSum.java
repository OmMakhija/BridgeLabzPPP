import java.util.Scanner;

// Purpose: Check natural number; if yes, print sum of first n natural numbers (formula)
class NaturalNumberAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number >= 0) {
            long sum = (long) number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        input.close();
    }
}
