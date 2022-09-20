package mall_shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    Scanner scan = new Scanner(System.in);
    ArrayList<BillingModel> billingList = new ArrayList<>();

    protected void printMainMenu(ToysClass obj) {

        System.out.println("Welcome to Mall Shopping");
        System.out.println("\nChoose  your products here");
        System.out.println("\n1. Toys\n2. Vegetables\n3. Dresses\n4.Checkout Bill");
        System.out.println("\nEnter your choice?");

        int choice = scan.nextInt();

        if (choice == 1) {
            ToysClass toysObj =  obj;
            if (toysObj == null) {
                toysObj = new ToysClass();
            }

            toysObj.printToysMenu(toysObj);

        } else if (choice == 2) {

        } else if (choice == 3) {

        } else {
            System.out.println("Invalid choice, Do you want to retry(Y/N)?");
            String input = scan.next();
            if (input.equals("Y")) {
                printMainMenu(null);
            } else {
                printBillDetails();
            }
        }
    }

    protected void printBillDetails() {

        if (billingList != null && billingList.size() > 0) {

            double totalBill = 0;
            System.out.println("Product Name \t Production Price \t Qty \t Total amount");
            for (BillingModel bill : billingList) {
                System.out.println(bill.getProductName() + " \t " + bill.getProductPrice() + " \t\t " + bill.getQty() + " \t " + bill.getTotalAmount());
                totalBill += bill.getTotalAmount();
            }
            System.out.println("\n\t\tTotal Purchased amount = " + totalBill + "  Rs only");

        } else {
            System.out.println("You Cart is  Empty, Thanks for shopping here.");
        }
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.printMainMenu(null);
    }

    protected   void showCartAddedMessage(boolean  isFailureCase, ToysClass toysObj){

        if(isFailureCase) {
            System.out.println("Invalid choice, Do you want to retry(Y/N)?");
        } else {
            System.out.println("Cart added successfully, Do you want to Continue(Y/N)?");
        }

        String input = scan.next();
        if(input.equalsIgnoreCase("Y")){
            printMainMenu(toysObj);
        } else {
            printBillDetails();
        }
    }
}
