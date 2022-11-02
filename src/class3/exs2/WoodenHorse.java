package class3.exs2;

import java.util.concurrent.ThreadLocalRandom;

public class WoodenHorse implements WoodenStructures{
    protected int id;
    protected double weight;

    public WoodenHorse() {
        this.id = ThreadLocalRandom.current().nextInt(100000000,999999999);
        this.weight = ThreadLocalRandom.current().nextDouble(5,20);
    }
    public WoodenHorse(int id) {
        this.id = id;
        this.weight = ThreadLocalRandom.current().nextDouble(5,20);
    }

    public WoodenHorse(int id, double weight) {
        this.id = id;
        this.weight = weight;
    }

    @Override
    public void roll() {
        System.out.println("Rolls");
    }

    @Override
    public WoodenHorse replicate() {
        return new WoodenHorse(this.id,this.weight);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "WoodenHorse{" +
                "id=" + id +
                ", weight=" + weight +
                '}';
    }
}
