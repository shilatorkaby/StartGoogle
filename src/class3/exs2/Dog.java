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
        public Dog mate(Animal animal) {
            return (new Dog(gender,randomId(),randomWight()));
        }

        @Override
        public String getAnimal() {
            return "dog";
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




