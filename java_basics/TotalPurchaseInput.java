import java.util.Scanner;

class TotalPurchaseInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = input.nextInt();

        double total = unitPrice * qty;
        System.out.println("The total purchase price is INR " + total +
                           " if the quantity " + qty +
                           " and unit price is INR " + unitPrice);
        input.close();
    }
}
