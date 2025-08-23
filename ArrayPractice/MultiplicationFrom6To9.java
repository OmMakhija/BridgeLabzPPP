package BridgeLabzPPP.ArrayPractice;
import java.util.Scanner;

public class MultiplicationFrom6To9 {

    public static void printTable(int number) {
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        printTable(number);
        scanner.close();
    }
}
