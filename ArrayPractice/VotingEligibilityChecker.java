import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void checkEligibility(int[] ages) {
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age entered.");
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt();
        }

        checkEligibility(ages);
        scanner.close();
    }
}
