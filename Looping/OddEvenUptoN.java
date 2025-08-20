import java.util.Scanner;

// Purpose: Print whether numbers from 1..n are odd or even
class OddEvenUptoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("Not a natural number");
            input.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is " + ((i % 2 == 0) ? "even" : "odd"));
        }
        input.close();
    }
}
