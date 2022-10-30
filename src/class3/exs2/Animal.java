package class3.exs2;

import java.util.concurrent.ThreadLocalRandom;

interface Animal {
    void move();
    Animal mate(Animal animal);
    String getAnimal();
    void setId(int Id);

    int getId();
    void setGender(AnimalAbstract.Gender gender);
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
