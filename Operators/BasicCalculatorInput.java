import java.util.Scanner;

class BasicCalculatorInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();

        double add = n1 + n2;
        double sub = n1 - n2;
        double mul = n1 * n2;
        String div = (n2 == 0) ? "undefined" : String.valueOf(n1 / n2);

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                           n1 + " and " + n2 + " is " + add + ", " + sub + ", " + mul + ", " + div);
        input.close();
    }
}
