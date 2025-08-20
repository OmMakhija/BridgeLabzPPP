import java.util.Scanner;

// Purpose: Sum until 0 or negative encountered, using while(true)+break
class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double val = input.nextDouble();
            if (val <= 0.0) break;
            total += val;
        }
        System.out.println("Total = " + total);
        input.close();
    }
}
