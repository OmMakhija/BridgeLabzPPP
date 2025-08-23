package BridgeLabzPPP.ArrayPractice;
import java.util.Scanner;

public class NumberClassifier {

    public static void classifyNumbers(int[] numbers) {
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even.");
                } else {
                    System.out.println(num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println(num + " is Zero.");
            }
        }

        // Compare first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and Last elements are Equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is Greater than Last.");
        } else {
            System.out.println("First element is Less than Last.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        classifyNumbers(numbers);
        scanner.close();
    }
}
