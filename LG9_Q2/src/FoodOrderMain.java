import java.util.Scanner;

public class FoodOrderMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        System.out.print("Do you want to place an order? (Yes/No): ");
        choice = input.next();

        while (!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no"))) {
            System.out.println("INVALID INPUT!");
            System.out.print("Do you want to place an order? (Yes/No): ");
            choice = input.next();
        }

        while (choice.equalsIgnoreCase("yes")) {
            FoodOrder order = new FoodOrder();
            input.nextLine(); 
            order.getInput();

            boolean hasCoupon = FoodOrder.checkForCoupons();

            if (hasCoupon) {
                System.out.print("Do you want to use a coupon? (Yes/No): ");
                String useCoupon = input.next();
                if (useCoupon.equalsIgnoreCase("yes")) {
                    order.applyCoupon();
                    System.out.println(order);
                }
            } else if (FoodOrder.getCouponCount() > 0) {
                System.out.print("Do you want to use a coupon? (Yes/No): ");
                String useCoupon = input.next();
                if (useCoupon.equalsIgnoreCase("yes")) {
                    order.applyCoupon();
                    System.out.println(order);
                }
            }

            System.out.print("Do you want to place an order? (Yes/No): ");
            choice = input.next();

            while (!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no"))) {
                System.out.println("INVALID INPUT!");
                System.out.print("Do you want to place an order? (Yes/No): ");
                choice = input.next();
            }
        }

        System.out.println("You have made " + FoodOrder.getOrderCount() + " orders.");
        System.out.println("You have " + FoodOrder.getCouponCount() + " coupons left.");
    }
}
