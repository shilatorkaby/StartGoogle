package class3.exs2;

public class WoodenHorseAdapter implements Animal{
    public WoodenHorse horse;

    public WoodenHorseAdapter(WoodenHorse horse) {
        this.horse = horse;
    }


    @Override
    public void move() {
        horse.roll();
    }

    @Override
    public Animal mate() {
        WoodenHorse repHorse=horse.replicate();
        //WoodenHorse horse= ho
        return new Horse(repHorse.id, repHorse.weight);
    }

    @Override
    public String getAnimal() {
        return "horse";
    }


    @Override
    public int getId() {
        return horse.getId();
    }


    @Override
    public AnimalAbstract.Gender getGender() {
        return null;
    }

    @Override
    public AnimalAbstract.Gender mateGender() {
        return null;
    }

    @Override
    public String toString(){return horse.toString();}
}
