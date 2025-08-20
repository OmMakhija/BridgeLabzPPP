import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a (int): ");
        int a = input.nextInt();

        System.out.print("Enter b (int): ");
        int b = input.nextInt();

        System.out.print("Enter c (int): ");
        int c = input.nextInt();

        int op1 = a + b * c;     // precedence: * before +
        int op2 = a * b + c;     // * before +
        String op3;              // c + a / b
        String op4;              // a % b + c

        if (b == 0) {
            op3 = "undefined (division by zero)";
            op4 = "undefined (division by zero)";
        } else {
            op3 = String.valueOf(c + (a / b));   // integer division
            op4 = String.valueOf((a % b) + c);
        }

        System.out.println("The results of Int Operations are " +
                op1 + ", " + op2 + ", " + op3 + ", " + op4);
        input.close();
    }
}
