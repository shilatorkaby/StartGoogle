package class1;

// class1.Main Class
public class IntegerStack {

    // main driver method
    public static void main(String[] args) {

        // Integer Stack

        stackArray s = new stackArray(3);

        // Pushing 3 elements to integer stack s
        s.push(10);
        s.push(20);
        s.push(30);
        // Print the stack elements after pushing the
        // elements
        System.out.println("s after pushing 10, 20 and 30 :\n" +s.printStack());
        System.out.println("\nAfter pushing 2 :" );
        s.push(2);

        // Now, pop from stack

        System.out.println("Output of pop()");
        System.out.println(s.pop());

        // Print the stack elements after pop()
        System.out.println("\ns after pop :\n" + s.printStack());
        s.push(2);
        System.out.println("\nAfter pushing 2 :\n" +s.printStack()+"\nwhile "+s.top()+" on the top");

    }
}
