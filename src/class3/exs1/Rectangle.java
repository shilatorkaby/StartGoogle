package class3.exs1;

public class Rectangle extends Figure{
    double length;
    double width;


    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return(length * width);
    }
}
