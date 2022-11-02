package class3.exs2;

import java.util.concurrent.ThreadLocalRandom;

interface Animal {
    String toString();
    void move();
    Animal mate();
    String getAnimal();

    int getId();

    AnimalAbstract.Gender getGender();

    default int randomId() // Generate random id number
    {
        return(ThreadLocalRandom.current().nextInt(10, 98 + 1));
    }
    AnimalAbstract.Gender mateGender();



    default float randomWight() // Generate random id number
    {
        return(ThreadLocalRandom.current().nextFloat(10, 98 + 1));
    }
}
