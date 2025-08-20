import java.util.Scanner;

// Purpose: Factorial using for loop
class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Not a natural number");
            input.close();
            return;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial(" + n + ") = " + fact);
        input.close();
    }
}
