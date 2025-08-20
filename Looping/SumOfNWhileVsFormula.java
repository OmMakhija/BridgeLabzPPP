import java.util.Scanner;

// Purpose: Compare sum via while loop vs formula n*(n+1)/2
class SumOfNWhileVsFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Not a natural number");
            input.close();
            return;
        }

        long formula = (long) n * (n + 1) / 2;

        long viaWhile = 0;
        int i = 1;
        while (i <= n) {
            viaWhile += i;
            i++;
        }

        System.out.println("Formula sum = " + formula + ", While sum = " + viaWhile);
        System.out.println("Match? " + (formula == viaWhile));
        input.close();
    }
}
