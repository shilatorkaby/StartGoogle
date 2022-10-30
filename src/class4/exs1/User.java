package class4.exs1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class User {
    String name;
    public List<Coupon> coupons;


    public User(String name) {
        this.name = name;
        this.coupons=new ArrayList<>();
    }


    public void printCoupons()
    {
            for (Coupon coupon : coupons)
            {
                System.out.println(coupon.toString());
            }
    }
}
