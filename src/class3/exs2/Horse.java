package class3.exs2;

import java.util.concurrent.ThreadLocalRandom;

public class Horse extends AnimalAbstract {

    public Horse() {
        gender= Gender.values()[ThreadLocalRandom.current().nextInt(Gender.values().length)];
        id=randomId();
        weight=randomWight();
    }
    public Horse(int id,double weight) {
        gender= Gender.values()[ThreadLocalRandom.current().nextInt(Gender.values().length)];
        this.id=id;
        this.weight=weight;
    }

    public Horse(Gender gender, int id, float weight) {
            this.gender= gender;
            this.id=id;
            this.weight=weight;
        }

        @Override
        public void move() {
            System.out.println("Running");
        }
        public Gender getGender()
        {
            return gender;
        }
        @Override
        public int getId() {
            return id;
        }

        @Override
        public class3.exs2.Cow mate() {
            return (new class3.exs2.Cow(gender,randomId(),randomWight()));
        }

        @Override
        public String getAnimal() {
            return "horse";
        }


    public Gender mateGender ()
    {
        if (gender== Gender.FEMALE)
            return (Gender.MALE);
        return (Gender.FEMALE);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "gender=" + gender +
                ", id=" + id +
                ", weight=" + weight +
                '}';
    }
}


