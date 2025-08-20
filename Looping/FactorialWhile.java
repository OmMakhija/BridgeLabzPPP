import java.util.Scanner;

// Purpose: Factorial using while loop
class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Not a natural number");
            input.close();
            return;
        }
        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial(" + n + ") = " + fact);
        input.close();
    }
}
