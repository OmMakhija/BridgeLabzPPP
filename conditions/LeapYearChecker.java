import java.util.Scanner;

// Program: LeapYearChecker
// Purpose: Check if a given year (>=1582) is a Leap Year.
// Method A: multi if-else
// Method B: single if using logical operators.
class LeapYearChecker {
    public static void main(String[] args) {
        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Read year
        System.out.print("Enter a year (>=1582): ");
        int year = input.nextInt();

        // Validate Gregorian calendar start
        if (year < 1582) {
            System.out.println("Invalid input! Leap year check works for year >= 1582.");
            input.close();
            return;
        }

        // -------- Method A: multiple if-else --------
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

        // -------- Method B: single condition with && and || --------
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("(Logical) " + year + " is a Leap Year");
        } else {
            System.out.println("(Logical) " + year + " is NOT a Leap Year");
        }

        input.close();
    }
}
