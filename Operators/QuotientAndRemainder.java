import java.util.Scanner;

class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        String quotient, remainder;
        if (number2 == 0) {
            quotient = "undefined";
            remainder = "undefined";
        } else {
            quotient = String.valueOf(number1 / number2);
            remainder = String.valueOf(number1 % number2);
        }

        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);
        input.close();
    }
}
