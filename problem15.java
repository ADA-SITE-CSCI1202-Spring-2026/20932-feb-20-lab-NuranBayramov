import java.util.Scanner;

public class problem15{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = input.nextInt();
        input.nextLine(); // consume newline

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part Number: ");
            String partNumber = input.nextLine();

            System.out.print("Part Description: ");
            String description = input.nextLine();

            System.out.print("Quantity: ");
            int quantity = input.nextInt();

            System.out.print("Price per Item: ");
            double price = input.nextDouble();
            input.nextLine(); // consume newline

            invoices[i] = new Invoice(partNumber, description, quantity, price);
        }

        System.out.println("\n--- Invoice Amounts ---");

        for (int i = 0; i < n; i++) {
            System.out.println("Invoice " + (i + 1) + " Amount: $" +
                    invoices[i].getInvoiceAmount());
        }

        input.close();
    }
}