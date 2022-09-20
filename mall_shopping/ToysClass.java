package mall_shopping;

public class ToysClass  extends MainClass{

    public void printToysMenu(ToysClass toysObj){
        System.out.println("Welcome Toys Section");
        System.out.println("\nChoose  your Toys here");
        System.out.println("\n1. Car\n2. Bike\n3. Plane");
        System.out.println("\nEnter your choice?");

        int choice = scan.nextInt();

        if(choice == 1){
            showCarDetails(toysObj);
        } else if(choice ==2) {
            showBikeDetails(toysObj);
        } else if(choice ==3) {
            showPlaneDetails(toysObj);
        } else {
          showCartAddedMessage(true, toysObj);
        }
    }

    private void showBikeDetails(ToysClass toysObj) {
        System.out.println("bIKE  Toys  here");
        System.out.println("\nBmw bike toys, Price = 100Rs");
        System.out.println("\nHo Many  piece u want?");
        int qty =  scan.nextInt();

        if(qty >0) {
            BillingModel bill = new BillingModel();
            bill.setProductName("BMW  Bike To");
            bill.setProductPrice(100);
            bill.setQty(qty);
            bill.setTotalAmount((qty *100));

            billingList.add(bill);

            showCartAddedMessage(false, toysObj);
        } else {
            System.out.println("enter the qty atleast 1 ");
        }
    }

    private void showCarDetails(ToysClass toysObj) {
        System.out.println("Car  Toys  here");
        System.out.println("\nBmw Car toys, Price = 120Rs");
        System.out.println("\nHo Many  piece u want?");
        int qty =  scan.nextInt();

        if(qty >0) {
            BillingModel bill = new BillingModel();
            bill.setProductName("BMW  Car To");
            bill.setProductPrice(120);
            bill.setQty(qty);
            bill.setTotalAmount((qty *100));

            billingList.add(bill);

            showCartAddedMessage(false, toysObj);
        } else {
            System.out.println("enter the qty atleast 1 ");
        }
    }

    private void showPlaneDetails(ToysClass toysObj) {
        System.out.println("Plane  Toys  here");
        System.out.println("\nBmw Plane toys, Price = 320Rs");
        System.out.println("\nHo Many  piece u want?");
        int qty =  scan.nextInt();

        if(qty >0) {
            BillingModel bill = new BillingModel();
            bill.setProductName("BMW  Plane To");
            bill.setProductPrice(320);
            bill.setQty(qty);
            bill.setTotalAmount((qty *100));

            billingList.add(bill);

            showCartAddedMessage(false, toysObj);
        } else {
            System.out.println("enter the qty atleast 1 ");
        }
    }
}
