import java.util.Scanner;

// Program: StudentGradeCalculator
// Purpose: Read marks for Physics, Chemistry, Maths; compute percentage;
//          print Grade and Remarks per provided table.
class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter marks in Physics: ");
        int physics = input.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int maths = input.nextInt();

        // Compute total, percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        // Determine Grade + Remarks (exact ranges from image)
        String grade, remarks;
        if (percentage >= 80.0) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70.0) {
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60.0) {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50.0) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40.0) {
            grade = "E";
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "(Remedial standards)";
        }

        // Output
        System.out.println("\n--- Result Summary ---");
        System.out.println("Average Mark (Percentage) = " + percentage + "%");
        System.out.println("Grade = " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
