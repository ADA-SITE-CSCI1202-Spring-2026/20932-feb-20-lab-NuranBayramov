public class Invoicetest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1234", "Hammer", 5, 9.99);
        Invoice invoice2 = new Invoice("5678", "Screwdriver", 10, 4.99);
        Invoice invoice3 = new Invoice("9012", "Wrench", -3, -19.99);

        System.out.println("Invoice 1:");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Part Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: $" + invoice1.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice1.getInvoiceAmount());

        System.out.println("\nInvoice 2:");
        System.out.println("Part Number: " + invoice2.getPartNumber());
        System.out.println("Part Description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price per Item: $" + invoice2.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice2.getInvoiceAmount());

        System.out.println("\nInvoice 3:");
        System.out.println("Part Number: " + invoice3.getPartNumber());
        System.out.println("Part Description: " + invoice3.getPartDescription());
        System.out.println("Quantity: " + invoice3.getQuantity());
        System.out.println("Price per Item: $" + invoice3.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice3.getInvoiceAmount());
    }
}