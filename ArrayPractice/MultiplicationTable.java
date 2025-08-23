package BridgeLabzPPP.ArrayPractice;
import java.util.Scanner;

public class MultiplicationTable {

    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table: ");
        int number = scanner.nextInt();

        printTable(number);
        scanner.close();
    }
}

