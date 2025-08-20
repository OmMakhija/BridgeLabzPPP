﻿import java.util.Scanner;

class TriangleAreaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base (cm): ");
        double base = input.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = input.nextDouble();

        double areaSqCm = 0.5 * base * height;
        double cmPerIn = 2.54;
        double areaSqIn = areaSqCm / (cmPerIn * cmPerIn);

        System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                           " and sq cm is " + areaSqCm);
        input.close();
    }
}
