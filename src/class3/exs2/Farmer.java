package class3.exs2;

public class Farmer{
    Farm farm;

    public Farmer() {
        this.farm = new Farm();
    }

    public void move(int id)
    {
        farm.provideAnimal(id).move();
    }
    public void addAnimalToFarm(Animal animal)
    {
        farm.acquire(animal);
    }

    public void mate(Animal animal)
    {farm.mate(animal);}
    public Animal requestAnimalFromFarm(int id) //It can provide Animals to outside users.
    {
        try {
            Animal animal = farm.provideAnimal(id);
            if (animal != null)
                return animal;
        }
        catch (IllegalAccessError e)
        {
            System.out.println("There is no animal with this id");
        }
        return null;
    }

    public void printAnimal(Animal animal){System.out.println(animal);}
public void printAll(){farm.printAll();}

}
