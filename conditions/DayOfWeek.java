import java.util.Scanner;

// Program: DayOfWeek
// Purpose: Print 0=Sun,1=Mon,... for date m d y using given integer formulas.
class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read m (1..12), d (1..31), y (>=1582 recommended)
        int m = input.nextInt();
        int d = input.nextInt();
        int y = input.nextInt();

        int y0 = y - (14 - m) / 12;
        int x  = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // d0: 0=Sunday,1=Monday,...,6=Saturday
        System.out.println(d0);

        input.close();
    }
}
