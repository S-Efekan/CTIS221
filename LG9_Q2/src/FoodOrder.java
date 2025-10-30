import java.util.Scanner;

public class FoodOrder {
    private String restaurant;
    private String item;
    private double price;

    private static int orderCount = 0;
    private static int couponCount = 0;
    private static final double COUPON = 30.0;

    FoodOrder() {
        restaurant = null;
        item = null;
        price = 0;
        orderCount++;
    }

    public static int getOrderCount() {
        return orderCount;
    }

    public static int getCouponCount() {
        return couponCount;
    }

    public void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter restaurant: ");
        restaurant = input.nextLine();

        System.out.print("Enter the ordered item: ");
        item = input.nextLine();

        System.out.print("Enter the price of the item: ");
        price = input.nextDouble();
    }

    public static boolean checkForCoupons() {
        if (orderCount % 2 == 0) {
            couponCount++;
            System.out.println("Congratulations! You won a coupon!");
            return true;
        } else {
            return false;
        }
    }

    public void applyCoupon() {
        if (couponCount > 0) {
            price -= COUPON;
            couponCount--;
        }
    }

    public String toString() {
        String output;
        output = "Food Order\n" +
                 "Restaurant= " + restaurant + "\n" +
                 "Item= " + item + "\n" +
                 "price= " + price + " TL";
        return output;
    }
}
