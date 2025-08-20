import java.util.Scanner;

// Purpose: Print "Its a Spring Season" if date in [Mar 20, Jun 20], else "Not a Spring Season"
class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();

        boolean spring =
            (month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1  && day <= 30) ||
            (month == 5 && day >= 1  && day <= 31) ||
            (month == 6 && day >= 1  && day <= 20);

        System.out.println(spring ? "Its a Spring Season" : "Not a Spring Season");
        input.close();
    }
}
