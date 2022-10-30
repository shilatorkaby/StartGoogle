package class3.exs2;
import java.util.HashMap;

public class Farm {
    HashMap<Animal, Animal> animalList;

    Farm() {
        animalList = new HashMap<>();
    }


    void acquire(Animal animal) //meaning generating new animals
    {
        animalList.put(animal, null);
    }

    void mate(Animal animal) //Create new Animals by the mate() function of existing Animals
    {
        AnimalAbstract.Gender g = animal.mateGender();
        switch (animal.getAnimal()) {
            case "cow": {
                animalList.put(animal, new Cow(g, animal.randomId(), animal.randomWight()));
            break;
            }
            case "ponyHorse": {
                animalList.put(animal, new Horse(g, animal.randomId(), animal.randomWight()));
            break;
            }
            case "dog": {
                animalList.put(animal, new Dog(g, animal.randomId(), animal.randomWight()));
            }
            default:
            {
                System.out.println("ILLEGAL ANIMAL");
            }
        }
    }


    Animal provideAnimal(int id) //It can provide Animals to outside users.
    {
        for (HashMap.Entry<Animal, Animal> entry : animalList.entrySet()) {
            if (entry.getValue().getId() == id) {
                return entry.getValue();
            } else if (entry.getKey().getId() == id) {
                return entry.getKey();
            }
        }
        return null;
    }

    void printAnimal(Animal animal)
    {
        System.out.println(animal.getAnimal() + "\tGender: " + animal.getGender()+" ID number:"+animal.getId());

    }
    void printAll() {
        for (HashMap.Entry<Animal, Animal> entry : animalList.entrySet()) {
            System.out.println("Mate1:");
            printAnimal(entry.getKey());
            if (entry.getValue() != null) {
                printAnimal(entry.getValue());
            } else {
                System.out.println("NO MATE ANIMAL\n");
            }
        }
        }


}
