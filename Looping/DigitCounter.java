import java.util.Scanner;

// Program: DigitCounter
// Purpose: Count number of digits in an integer (handles 0 & negatives).
class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Count = 1");
            input.close();
            return;
        }

        int n = Math.abs(number);
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        System.out.println("Count = " + count);

        input.close();
    }
}
