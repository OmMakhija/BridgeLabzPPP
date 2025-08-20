import java.util.Scanner;

// Program: MultiplesBelow100For
// Purpose: Print all multiples of a positive integer below or equal to 100
class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive integer less than 100.");
            input.close();
            return;
        }

        for (int i = 1; i <= 100; i++) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
