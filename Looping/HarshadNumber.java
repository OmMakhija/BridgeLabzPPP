import java.util.Scanner;

// Program: HarshadNumber
// Purpose: Check if number is divisible by the sum of its digits.
class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int n = Math.abs(number);
        int sum = 0, temp = n;

        while (temp != 0) {
            sum += (temp % 10);
            temp /= 10;
        }

        boolean isHarshad = (sum != 0) && (n % sum == 0);
        System.out.println(number + (isHarshad ? " is a Harshad Number" : " is NOT a Harshad Number"));

        input.close();
    }
}
