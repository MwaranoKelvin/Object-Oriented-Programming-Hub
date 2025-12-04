//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] Qty = {4, 10, 9, 10};
        String[] ItemDetails = { "Pencil", "Duster", "Pens", "Crayon"};
        double[] UnitPrice = {20, 50, 30, 80};
        double[] Amount = {80, 500, 270, 800};

//        double Amount2 = Qty[1] * UnitPrice[1];

        System.out.println("========================================================|");
        System.out.println("|Qty" + "\t|" + "Unit Details" + "\t\t|" +  "Unit Price" + "\t\t|" +  "Amount     |");
        System.out.println("--------------------------------------------------------|");

        for( int index = 0; index < Qty.length & index < ItemDetails.length & index < UnitPrice.length & index < Amount.length; index++) {
            System.out.println("|" + Qty[index] + "\t\t|" + ItemDetails[index] + "\t\t\t\t|" + UnitPrice[index] + "\t\t\t|" + Amount[index]);

        }
        System.out.println("========================================================|");

//        for( int i = 0; i < UnitPrice.length; i++) {
//            System.out.println("The Unit Price: " + UnitPrice[i]);
//        }
//
//        for(int j = 0; j < ItemDetails.length; j++) {
//            System.out.println("The Item Details: " + ItemDetails[j]);1
//        }
    }
}