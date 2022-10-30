package class3.exs1;

public class Circle extends Figure {

    double radius;

    Circle(double radius) {
    this.radius = radius;
}
    public double getArea()
    {
        return(Math.PI * (radius * radius));
    }

}
