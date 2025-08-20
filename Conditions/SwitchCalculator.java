import java.util.Scanner;

// Program: SwitchCalculator
// Purpose: Calculator using switch...case for +, -, *, /
class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputs
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();  // "+", "-", "*", "/"

        switch (op) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                if (second == 0.0) {
                    System.out.println("Division by zero is undefined");
                } else {
                    System.out.println(first / second);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
