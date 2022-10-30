package class3.exs1;

// Tagged class - vastly inferior to a class hierarchy! (Page 109)
public abstract class Figure {
    public abstract double getArea();

    void area() {
       System.out.println("Area is:"+getArea());
    }
}