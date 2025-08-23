package BridgeLabzPPP.ArrayPractice;
import java.util.Scanner;

public class NumberStorage {

    public static void displayNumbers(double[] numbers, int count) {
        double total = 0.0;
        System.out.print("Numbers entered: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\nSum of numbers = " + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        int index = 0;

        System.out.println("Enter numbers (max 10, stop with 0 or negative):");

        while (index < 10) {
            double num = scanner.nextDouble();
            if (num <= 0) break;
            numbers[index++] = num;
        }

        displayNumbers(numbers, index);
        scanner.close();
    }
}

