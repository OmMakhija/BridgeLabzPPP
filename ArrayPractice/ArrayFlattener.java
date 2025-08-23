package BridgeLabzPPP.ArrayPractice;
import java.util.Scanner;

public class ArrayFlattener {

    public static int[] flattenArray(int[][] matrix, int rows, int cols) {
        int[] array = new int[rows * cols];
        int index = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                array[index++] = element;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] array = flattenArray(matrix, rows, cols);
        System.out.println("1D Array elements:");
        for (int val : array) {
            System.out.print(val + " ");
        }

        scanner.close();
    }
}
