import java.util.Scanner;

// Program: FizzBuzzWhile
// Purpose: FizzBuzz using a while loop with positive integer validation
class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }

        int i = 1;
        while (i <= n) {
            if (i % 15 == 0)      System.out.println("FizzBuzz");
            else if (i % 3 == 0)  System.out.println("Fizz");
            else if (i % 5 == 0)  System.out.println("Buzz");
            else                  System.out.println(i);
            i++;
        }
        input.close();
    }
}
