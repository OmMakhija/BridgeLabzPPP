import java.util.Scanner;

class IntOperationInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a (int): ");
        int a = input.nextInt();
        System.out.print("Enter b (int): ");
        int b = input.nextInt();
        System.out.print("Enter c (int): ");
        int c = input.nextInt();

        int op1 = a + b * c;
        int op2 = a * b + c;
        String op3 = (b == 0) ? "undefined" : String.valueOf(c + (a / b));
        String op4 = (b == 0) ? "undefined" : String.valueOf((a % b) + c);

        System.out.println("The results of Int Operations are " +
                           op1 + ", " + op2 + ", " + op3 + ", " + op4);
        input.close();
    }
}
