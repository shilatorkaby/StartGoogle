package class3.exs2;

import class3.exs2.Animal;
import class3.exs2.AnimalAbstract;
import class3.exs2.Cow;

public class Horse extends AnimalAbstract {
        public Horse(Gender genderA,int idA,float weightA) {
            gender= genderA;
            id=idA;
            weight=weightA;
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
        public class3.exs2.Cow mate(Animal animal) {
            return (new class3.exs2.Cow(gender,randomId(),randomWight()));
        }

        @Override
        public String getAnimal() {
            return "horse";
        }

        @Override
        public void setId(int Id) {
            id=Id;
        }

        @Override
        public void setGender(Gender gender_) {
            gender=gender_;
        }

    public Gender mateGender ()
    {
        if (gender== Gender.FEMALE)
            return (Gender.MALE);
        return (Gender.FEMALE);
    }

}


