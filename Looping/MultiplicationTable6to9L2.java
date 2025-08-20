import java.util.Scanner;

// Program: MultiplicationTable6to9L2
// Purpose: Print table for a given number from 6 to 9
class MultiplicationTable6to9L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        input.close();
    }
}
