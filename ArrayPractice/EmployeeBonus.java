package BridgeLabzPPP.ArrayPractice;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            while (sal <= 0) {
                System.out.print("Invalid salary. Enter again: ");
                sal = sc.nextDouble();
            }
            salary[i] = sal;

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            int years = sc.nextInt();
            while (years < 0) {
                System.out.print("Invalid years. Enter again: ");
                years = sc.nextInt();
            }
            yearsOfService[i] = years;

            if (years > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n=== Salary Summary ===");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
