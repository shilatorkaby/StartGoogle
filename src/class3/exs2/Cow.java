package class3.exs2;

public class Cow extends AnimalAbstract{
    public Cow(Gender genderA,int idA,float weightA) {
        gender= genderA;
        id=idA;
        weight=weightA;
    }

    @Override
    public void move() {
        System.out.println("Walking slow");
    }
    public Gender getGender()
    {
        return gender;
    }

    @Override
    public Cow mate(Animal animal) {

        return (new Cow(gender,randomId(),randomWight()));

    }

    @Override
    public String getAnimal() {
        return "cow";
    }

    @Override
    public int getId() {
        return id;
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
