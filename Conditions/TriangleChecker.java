import java.util.Scanner;

// Purpose: Check if three angles are internal angles of a triangle (sum == 180)
class TriangleChecker {
    public static void main(String[] args) {
        // Create a Scanner object (user input)
        Scanner input = new Scanner(System.in);

        // Read three angles (integers)
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // Compute sum
        int sumOfAngles = x + y + z;

        // Display the entered values and sum
        System.out.println("The given angles " + x + ", " + y + ", " + z +
                           " add to " + sumOfAngles);

        // Check triangle condition and print result
        if (sumOfAngles == 180) {
            System.out.println("The given angles are internal angles of a Triangle");
        } else {
            System.out.println("The given angles are not internal angles of a Triangle");
        }

        // Close scanner
        input.close();
    }
}
