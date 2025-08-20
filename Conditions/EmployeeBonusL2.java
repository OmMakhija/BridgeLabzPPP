import java.util.Scanner;

// Program: EmployeeBonusL2
// Purpose: 5% bonus for service strictly greater than 5 years
class EmployeeBonusL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();

        double bonus = (years > 5) ? salary * 0.05 : 0.0;
        System.out.println("Bonus amount = " + bonus);

        input.close();
    }
}
