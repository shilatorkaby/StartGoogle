package class3.exs1;

public class Square extends Figure{
    double side;


    Square(double side) {
        this.side=side;
    }
    public double getArea()
    {
        return (Math.pow(side,2));
    }


}
