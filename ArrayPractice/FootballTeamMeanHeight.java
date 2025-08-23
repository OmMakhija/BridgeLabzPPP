package BridgeLabzPPP.ArrayPractice;
import java.util.Scanner;

public class FootballTeamMeanHeight {

    public static double calculateMean(double[] heights) {
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        return sum / heights.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];

        System.out.println("Enter heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
        }

        System.out.println("Mean height of the football team: " + calculateMean(heights));
        scanner.close();
    }
}

