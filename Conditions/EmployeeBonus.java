import java.util.Scanner;

// Purpose: If years of service > 5, bonus = 5% of salary
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();

        double bonus = (years > 5) ? (0.05 * salary) : 0.0;

        System.out.println("Bonus amount = " + bonus);
        input.close();
    }
}
