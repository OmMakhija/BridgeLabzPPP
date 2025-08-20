import java.util.Scanner;

// Purpose: Compare sum via for loop vs formula n*(n+1)/2
class SumOfNForVsFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Not a natural number");
            input.close();
            return;
        }

        long formula = (long) n * (n + 1) / 2;

        long viaFor = 0;
        for (int i = 1; i <= n; i++) {
            viaFor += i;
        }

        System.out.println("Formula sum = " + formula + ", For sum = " + viaFor);
        System.out.println("Match? " + (formula == viaFor));
        input.close();
    }
}
