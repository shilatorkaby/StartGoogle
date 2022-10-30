package class4.exs1;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Coupon {
    int id;
    Date date;
    String value;


    public Coupon(int id, Date date, String value) {
        this.id = id;
        this.date = date;
        this.value = value;
    }
    public Coupon()
    {
        this.id = 0;
        this.date = null;
        this.value = null;
    }
    public Coupon(String value)
    {
        this.id = randomId();
        this.date = randomDate();
        this.value = value;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "id=" + id +
                ", date=" + date +
                ", value='" + value + '\'' +
                '}';
    }

    Date randomDate() {
        return new Date(ThreadLocalRandom.current().nextInt() * 1000L);
    }
    int randomId() {
        return (ThreadLocalRandom.current().nextInt(10, 98 + 1));
    }



}
