import java.util.Scanner;

class DoubleOperationInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a (double): ");
        double a = input.nextDouble();
        System.out.print("Enter b (double): ");
        double b = input.nextDouble();
        System.out.print("Enter c (double): ");
        double c = input.nextDouble();

        double op1 = a + b * c;
        double op2 = a * b + c;
        String op3 = (b == 0.0) ? "undefined" : String.valueOf(c + (a / b));
        String op4 = (b == 0.0) ? "undefined" : String.valueOf((a % b) + c);

        System.out.println("The results of Double Operations are " +
                           op1 + ", " + op2 + ", " + op3 + ", " + op4);
        input.close();
    }
}
