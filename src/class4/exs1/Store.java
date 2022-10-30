package class4.exs1;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Store {
    public Store() {
    }

    void assignCoupon(List<Coupon> coupons,String name)
    {
        coupons.add(new Coupon(name));
    }

    Coupon getById(List<Coupon> coupons,int id)
    {
        for (Coupon coupon:coupons)
        {
           if(coupon.id==id)
               return coupon;
        }
        throw new  IllegalAccessError("Coupon's id doesn't exist".toString());
    }
    Coupon getByDate(List<Coupon> coupons,Date date)
    {
        for (Coupon coupon:coupons)
        {
           if(coupon.date==date)
               return coupon;
        }
        throw new  IllegalAccessError("Coupon's date doesn't exist".toString());
    }
    Coupon getByvalue(List<Coupon> coupons,String value)
    {
        for (Coupon coupon:coupons)
        {
           if(coupon.value==value)
               return coupon;
        }
        throw new  IllegalAccessError("Coupon's value doesn't exist".toString());
    }

    public void addRandomCoupons(List<Coupon> coupons,int num)
    {
        for (int i = 1; i < num+1; i++) {
            coupons.add(new Coupon("%"+i*10));
        }
    }

    void useCouponeById(List<Coupon> coupons,int id) //use coupon by id
    {
        if(coupons.size()>0)
        {
           System.out.println(getById(coupons,id));
           coupons.remove(id);
        }
        else {
            throw new IllegalCallerException("List of coupons is Empty".toString());
        }
    }


    void useCouponByDate(List<Coupon> coupons) //use coupon by the closest expiry date from a user’s list
    {
        Coupon closestDate = coupons.stream().max(Comparator.comparing(v -> v.date)).get();
        useCoupon(coupons,closestDate);

    }
    void useCouponByValue(List<Coupon> coupons, String value) //use coupon by the highest value from a user’s list
    {
        Coupon maxValue = coupons.stream().max(Comparator.comparing(v -> v.value)).get();
        useCoupon(coupons,maxValue);
    }


    public void useCoupon(List<Coupon> coupons)//use a randomly selected coupon from a user’s list
    {
        Coupon c=coupons.get(ThreadLocalRandom.current().nextInt(coupons.size()) % coupons.size());
        useCoupon(coupons,c);
    }

    public void useCoupon(List<Coupon> coupons,Coupon c)//use a randomly selected coupon from a user’s list
    {
        System.out.println("\nUsed on coupon-");
        System.out.println(c);
        coupons.remove(c);
    }
}
