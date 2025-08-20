import java.util.Scanner;

// Program: BMICalculator
// Purpose: Compute BMI from weight (kg) and height (cm) and classify per table.
class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (cm): ");
        double heightCm = input.nextDouble();

        // Convert cm -> m
        double heightM = heightCm / 100.0;

        // BMI = kg / (m^2)
        double bmi = weight / (heightM * heightM);

        // Category mapping (exact from image)
        String category;
        if (bmi <= 18.4) {
            category = "Underweight";
        } else if (bmi < 25.0) {            // 18.5–24.9
            category = "Normal";
        } else if (bmi < 40.0) {            // 25.0–39.9
            category = "Overweight";
        } else {                            // >= 40.0
            category = "Obese";
        }

        System.out.println("BMI = " + bmi + " (" + category + ")");
        input.close();
    }
}
