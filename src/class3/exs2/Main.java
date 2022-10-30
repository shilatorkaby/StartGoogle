package class3.exs2;

public class Main {
    static Farmer farmer= new Farmer();

    public static void main(String[] args) {
        Cow cow= new Cow(AnimalAbstract.Gender.FEMALE,12, (float) 15.3);
        farmer.addAnimalToFarm(cow);

        farmer.printAll();

        farmer.mate(cow);
        farmer.printAnimal(farmer.requestAnimalFromFarm(12)); //request animal from farm by id

        PonyHorse horse=new PonyHorse(140,AnimalAbstract.Gender.MALE,56,26);
        farmer.addAnimalToFarm(horse);
        farmer.printAll();

        Dog dog=new Dog(AnimalAbstract.Gender.MALE,70,15);
        farmer.addAnimalToFarm(dog);

        farmer.mate(horse);

        farmer.printAll();
        System.out.println("Pony horse can be on height of: "+horse.height);

    }
}
