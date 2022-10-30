package class5.exs2;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class Item {
    enum Types {ACCESSORY,BEAUTY,INSTALLATIONS,FOOD}
    final String name;
    final Types productType;
    final LocalDate date;
    final float weight;

    Item() {
        this.name = randomName();
        this.productType = randomType();
        this.date = randomDate();
        this.weight = randomWeight();
    }
    Item(Item item)
    {
        this.name = item.name;
        this.productType = item.productType;
        this.date = item.date;
        this.weight = item.weight;
    }
    Item(String name)
    {
        this.name = name;
        this.productType = randomType();
        this.date = randomDate();
        this.weight = randomWeight();
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", productType=" + productType +
                ", date=" + date +
                ", weight=" + weight +
                '}';
    }

    public int compareTo(Item item) {
        return getDate().compareTo(item.getDate());
    }

    String getName() {return name;}

    Types getProductType() {return productType;}

    float getWeight() {return weight;}

    Types randomType()
    {
        return Types.values()[ThreadLocalRandom.current().nextInt(Types.values().length)];
    }

    LocalDate getDate(){return date;}
    LocalDate randomDate()
    {
        long minDay = LocalDate.of(2020, 12, 31).toEpochDay();
        long maxDay = LocalDate.of(2025, 12, 31).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        return(LocalDate.ofEpochDay(randomDay));
    }

    float randomWeight() // Generate random id number
    { return (ThreadLocalRandom.current().nextFloat( 0,30)); }

    String randomName() {

        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }
        return (sb.toString());
    }

    public static void main(String[] args) {
        Item item =new Item();
        System.out.println(item);


    }


}
