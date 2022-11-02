package class3.exs2;

public class Dog extends AnimalAbstract {
        public Dog(Gender genderA,int idA,float weightA) {
            gender= genderA;
            id=idA;
            weight=weightA;
        }

        @Override
        public void move() {
            System.out.println("Jumping");
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
        public Dog mate() {
            return (new Dog(gender,randomId(),randomWight()));
        }

        @Override
        public String getAnimal() {
            return "dog";
        }

        public Gender mateGender ()
        {
            if (gender== Gender.FEMALE)
                return (Gender.MALE);
            return (Gender.FEMALE);
        }

    @Override
    public String toString() {
        return "Dog{" +
                "gender=" + gender +
                ", id=" + id +
                ", weight=" + weight +
                '}';
    }
}




