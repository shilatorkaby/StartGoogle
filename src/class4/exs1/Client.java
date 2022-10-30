package class4.exs1;

public class Client {

    public static void main(String[] args) {
        User user = new User("Moshe");
        Store store=new Store();

        store.assignCoupon(user.coupons,"new coupon"); //add specific coupon
        store.addRandomCoupons(user.coupons,5); //add random 5 coupons
        System.out.println("\nList of coupons after adding 5 random coupons+ 1:");
        user.printCoupons();

        store.useCouponByValue(user.coupons,"new coupon"); //use coupon by value
        System.out.println("\nAfter using New Coupon:");
        user.printCoupons();

        store.useCoupon(user.coupons); //use random coupon
        System.out.println("\nAfter using random coupon:");
        user.printCoupons();

        store.useCouponByDate(user.coupons); //use coupon with the closest expiry date
        System.out.println("\nAfter using coupon with the closest expiry date:");
        user.printCoupons();

        store.useCouponByDate(user.coupons); //use coupon with the highest value
        System.out.println("\nAfter using coupon with the highest value:");
        user.printCoupons();




    }

}
