package class3.exs1;

public class Main {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        System.out.println("For Rectangle-");
        r.area();

        Square s = new Square(4);
        System.out.println("\nFor Square-");
        s.area();

        Circle c = new Circle(2);
        System.out.println("\nFor Circle-");
        c.area();
    }

}
