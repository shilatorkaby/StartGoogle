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
    public Cow mate() {

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

    public Gender mateGender ()
    {
        if (gender== Gender.FEMALE)
            return (Gender.MALE);
        return (Gender.FEMALE);
    }

    @Override
    public String toString() {
        return "Cow{" +
                "gender=" + gender +
                ", id=" + id +
                ", weight=" + weight +
                '}';
    }
}
