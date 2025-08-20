import java.util.Scanner;

// Purpose: Keep summing double inputs until user enters 0
class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double val = input.nextDouble();
            if (val == 0.0) break;
            total += val;
        }
        System.out.println("Total = " + total);
        input.close();
    }
}
