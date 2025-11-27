import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bill To Information
        System.out.println("=== BILL TO INFORMATION ===");
        System.out.print("Company Name: ");
        String billCompany = input.nextLine();
        System.out.print("Address Line 1: ");
        String billAddress1 = input.nextLine();
        System.out.print("Address Line 2: ");
        String billAddress2 = input.nextLine();
        System.out.print("GSTIN: ");
        String billGSTIN = input.nextLine();
        System.out.print("Contact: ");
        String billContact = input.nextLine();
        System.out.print("Email: ");
        String billEmail = input.nextLine();
//
//        // Ship To Information
        System.out.println("\n=== SHIP TO INFORMATION ===");
        System.out.print("Company Name: ");
        String shipCompany = input.nextLine();
        System.out.print("Address Line 1: ");
        String shipAddress1 = input.nextLine();
        System.out.print("Address Line 2: ");
        String shipAddress2 = input.nextLine();
        System.out.print("GSTIN: ");
        String shipGSTIN = input.nextLine();
        System.out.print("Contact: ");
        String shipContact = input.nextLine();
        System.out.print("Email: ");
        String shipEmail = input.nextLine();
//
        // Payment Terms
        System.out.println("\n=== PAYMENT INFORMATION ===");
        System.out.print("Payment Date: ");
        String paymentDate = input.nextLine();
        System.out.print("Payment Terms: ");
        String paymentTerms = input.nextLine();
//
        // Product 1
        System.out.println("\n=== PRODUCT 1 INFORMATION ===");
        System.out.print("S.No: ");
        int sno1 = input.nextInt();
        System.out.print("Product Code: ");
//        String code1 = input.nextLine();
        int code1 = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String name1 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn1 = input.next();
        System.out.print("Quantity: ");
        int qty1 = input.nextInt();
        input.nextLine(); // consume newline
        System.out.print("Units: ");
        String units1 = input.nextLine();
        System.out.print("Rate: ");
        double rate1 = input.nextDouble();
        System.out.print("Tax %: ");
        double tax1 = input.nextDouble();
//
//        // Product 2
        System.out.println("\n=== PRODUCT 2 INFORMATION ===");
        System.out.print("S.No: ");
        int sno2 = input.nextInt();
        System.out.print("Product Code: ");
        int code2 = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String name2 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn2 = input.next();
        System.out.print("Quantity: ");
        int qty2 = input.nextInt();
        input.nextLine();
        System.out.print("Units: ");
        String units2 = input.nextLine();
        System.out.print("Rate: ");
        double rate2 = input.nextDouble();
        System.out.print("Tax %: ");
        double tax2 = input.nextDouble();
//
//        // Product 3
        System.out.println("\n=== PRODUCT 3 INFORMATION ===");
        System.out.print("S.No: ");
        int sno3 = input.nextInt();
        System.out.print("Product Code: ");
        int code3 = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String name3 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn3 = input.next();
        System.out.print("Quantity: ");
        int qty3 = input.nextInt();
        input.nextLine();
        System.out.print("Units: ");
        String units3 = input.nextLine();
        System.out.print("Rate: ");
        double rate3 = input.nextDouble();
        System.out.print("Tax %: ");
        double tax3 = input.nextDouble();

        // Product 4
        System.out.println("\n=== PRODUCT 4 INFORMATION ===");
        System.out.print("S.No: ");
        int sno4 = input.nextInt();
        System.out.print("Product Code: ");
        int code4 = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String name4 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn4 = input.next();
        System.out.print("Quantity: ");
        int qty4 = input.nextInt();
        input.nextLine();
        System.out.print("Units: ");
        String units4 = input.nextLine();
        System.out.print("Rate: ");
        double rate4 = input.nextDouble();
        System.out.print("Tax %: ");
        double tax4 = input.nextDouble();

        // Product 5
        System.out.println("\n=== PRODUCT 5 INFORMATION ===");
        System.out.print("S.No: ");
        int sno5 = input.nextInt();
        System.out.print("Product Code: ");
        int code5 = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String name5 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn5 = input.next();
        System.out.print("Quantity: ");
        int qty5 = input.nextInt();
        input.nextLine();
        System.out.print("Units: ");
        String units5 = input.nextLine();
        System.out.print("Rate: ");
        double rate5 = input.nextDouble();
        System.out.print("Tax %: ");
        double tax5 = input.nextDouble();

        // Product 6
        System.out.println("\n=== PRODUCT 6 INFORMATION ===");
        System.out.print("S.No: ");
        int sno6 = input.nextInt();
        System.out.print("Product Code: ");
        int code6 = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String name6 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn6 = input.next();
        System.out.print("Quantity: ");
        int qty6 = input.nextInt();
        input.nextLine();
        System.out.print("Units: ");
        String units6 = input.nextLine();
        System.out.print("Rate: ");
        double rate6 = input.nextDouble();
        System.out.print("Tax %: ");
        double tax6 = input.nextDouble();

        // Product 7
        System.out.println("\n=== PRODUCT 7 INFORMATION ===");
        System.out.print("S.No: ");
        int sno7 = input.nextInt();
        System.out.print("Product Code: ");
        int code7 = input.nextInt();
        input.nextLine();
        System.out.print("Product Name: ");
        String name7 = input.nextLine();
        System.out.print("HSN Code: ");
        String hsn7 = input.next();
        System.out.print("Quantity: ");
        int qty7 = input.nextInt();
        input.nextLine();
        System.out.print("Units: ");
        String units7 = input.nextLine();
        System.out.print("Rate: ");
        double rate7 = input.nextDouble();
        System.out.print("Tax %: ");
        double tax7 = input.nextDouble();
//
//        // Calculate amounts before tax
        double subtotal1 = qty1 * rate1;
        double subtotal2 = qty2 * rate2;
        double subtotal3 = qty3 * rate3;
        double subtotal4 = qty4 * rate4;
        double subtotal5 = qty5 * rate5;
        double subtotal6 = qty6 * rate6;
        double subtotal7 = qty7 * rate7;
//
//        // Calculate tax amounts
        double taxAmount1 = subtotal1 * (tax1 / 100);
        double taxAmount2 = subtotal2 * (tax2 / 100);
        double taxAmount3 = subtotal3 * (tax3 / 100);
        double taxAmount4 = subtotal4 * (tax4 / 100);
        double taxAmount5 = subtotal5 * (tax5 / 100);
        double taxAmount6 = subtotal6 * (tax6 / 100);
        double taxAmount7 = subtotal7 * (tax7 / 100);
//
//        // Calculate total amounts (subtotal + tax)
        double amount1 = subtotal1 + taxAmount1;
        double amount2 = subtotal2 + taxAmount2;
        double amount3 = subtotal3 + taxAmount3;
        double amount4 = subtotal4 + taxAmount4;
        double amount5 = subtotal5 + taxAmount5;
        double amount6 = subtotal6 + taxAmount6;
        double amount7 = subtotal7 + taxAmount7;
//
        // Calculate totals
        double total = amount1 + amount2 + amount3 + amount4 + amount5 + amount6 + amount7;
        double discountPercent = 0.6368;
        double discounts = total * (discountPercent / 100);
        double grandTotal = total - discounts;

        input.close();

        // Print Invoice
        System.out.println("\n\n");


        // Header
        System.out.println("=========================================================================================================================================");
        System.out.println( "Bill To:" + "\t\t\t\t\t\t\t\t\t\t\t\t" + "Ship To:");
        System.out.println("========================================================================================================================================== ");
        System.out.println( billCompany + "\t\t\t\t\t\t\t\t\t" + shipCompany);
        System.out.println( billAddress1 + "\t\t\t\t\t\t\t\t\t\t" + shipAddress1);
        System.out.println( billAddress2 + "\t\t\t\t\t\t" + shipAddress2);
        System.out.println( "GSTIN: " + billGSTIN + "\t\t\t\t\t\t\t\t\t\t" + "GSTIN: " + shipGSTIN);
        System.out.println( "Contact: " + billContact + "\t\t\t\t\t\t\t\t\t" + "Contact: " + shipContact);
        System.out.println( "Email: " + billEmail + "\t\t\t\t\t\t" + "Email: " + shipEmail);
        System.out.println();
//        System.out.println("===========================================================================================================================================");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println( "Payment Date: " + paymentDate + "\t\t\t\t" + "Payment Terms: " + paymentTerms);
        System.out.println();

        // Table Header
        System.out.println("===========================================================================================================================================");
        System.out.println("| S.No" + "\t\t" + "| Product Code" + "\t\t" + "| Product Name" + "\t\t" + "| HSN code" + "\t\t" + "| Quantity" + "\t\t\t" + "    | Units" + "\t\t"  + "| Rate" + "\t\t" + "| Tax" + "\t\t"  + "|Amount");
        System.out.println("===========================================================================================================================================");

//        // Product rows
        System.out.println("| " + sno1 + "\t\t\t| " + code1 + "\t\t\t\t| " + name1 + "\t| " + hsn1 + "\t\t| " + qty1 + "\t\t\t\t\t| " + units1 + "\t\t| " + String.format("%.2f", rate1) + "\t| " + tax1 + "%" + "\t\t | " + String.format("%.2f", amount1) + "|");
        System.out.println("| " + sno2 + "\t\t\t| " + code2 + "\t\t\t\t| " + name2 + "\t\t\t| " + hsn2 + "\t\t| " + qty2 + "\t\t\t\t\t| " + units2 + "\t\t| " + String.format("%.2f", rate2) + "\t\t| " + tax2 + "%" + "\t\t | " + String.format("%.2f", amount2) + " |");
        System.out.println("| " + sno3 + "\t\t\t| " + code3 + "\t\t\t\t| " + name3 + "\t| " + hsn3 + "\t\t| " + qty3 + "\t\t\t\t\t| " + units3 + "\t\t| " + String.format("%.2f", rate3) + "\t\t| " + tax3 + "%" + "\t\t | " + String.format("%.2f", amount3) + " |");
        System.out.println("| " + sno4 + "\t\t\t| " + code4 + "\t\t\t\t| " + name4 + "\t| " + hsn4 + "\t\t| " + qty4 + "\t\t\t\t\t| " + units4 + "\t\t| " + String.format("%.2f", rate4) + "\t\t| " + tax4 + "%" + "\t\t | " + String.format("%.2f", amount4) + " |");
        System.out.println("| " + sno5 + "\t\t\t| " + code5 + "\t\t\t\t| " + name5 + "\t| " + hsn5 + "\t\t| " + qty5 + "\t\t\t\t\t| " + units5 + "\t\t| " + String.format("%.2f", rate5) + "\t\t| " + tax5 + "%" + "\t\t | " + String.format("%.2f", amount5) + " |");
        System.out.println("| " + sno6 + "\t\t\t| " + code6 + "\t\t\t\t| " + name3 + "\t| " + hsn6 + "\t\t| " + qty6 + "\t\t\t\t\t| " + units6 + "\t\t| " + String.format("%.2f", rate6) + "\t\t| " + tax6 + "%" + "\t\t | " + String.format("%.2f", amount6) + "  |");
        System.out.println("| " + sno7 + "\t\t\t| " + code7 + "\t\t\t\t| " + name7 + "\t| " + hsn7 + "\t\t| " + qty7 + "\t\t\t\t\t| " + units7 + "\t\t| " + String.format("%.2f", rate7) + "\t\t| " + tax7 + "%" + "\t\t | " + String.format("%.2f", amount7) + " |");




        System.out.println("==========================================================================================================================================");

//        // Totals
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| Total " + String.format(" \t | " +"%.2f", total) + " |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| Discounts " + String.format(" | " + "%.2f", discounts) + " |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| GrandTotal " + String.format("| " + "%.2f", grandTotal) + " |");

    }
}


