import java.util.Scanner;

class QuotientRemainderInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        String q = (b == 0) ? "undefined" : String.valueOf(a / b);
        String r = (b == 0) ? "undefined" : String.valueOf(a % b);

        System.out.println("The Quotient is " + q + " and Reminder is " + r +
                           " of two number " + a + " and " + b);
        input.close();
    }
}
