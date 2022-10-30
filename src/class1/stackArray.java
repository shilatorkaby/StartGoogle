package class1;

import java.io.*; // Importing input output classes
import java.util.*; // Importing all utility classes

public class stackArray {
        int[] stack;    // Empty array list

    // Default value of top variable when stack is empty
        int top = -1; //for empty stack
        int Size=0;


        stackArray(int size)// Constructor to initialize the stack
        {
            this.stack = new int[size];
            Size=size;// Creating array on length of size
        }

        void push(int X)
        {
            // Checking if array is full
            if (top +1 == Size) {
                System.out.println("Stack Overflow"); // Display message when array is full
            }
            else {
                top = top + 1; // Increment top to go to next position
                 if (stack.length > top)
                    stack[top]= X; //update the top element
                else { // Creating new element
                    int [] temp =new int [Size++]; // Creating array on length of size+1
                    for (int i = 0; i < Size; i++) {
                        temp[i] = stack[i];
                    }
                    temp[-1]=X; //Insert the new value
                    stack=temp;
                }
            }
        }


        int top() // To return topmost element of stack
        {
            // If stack is empty
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            else // else elements are presents
                return stack[top];
        }

        int pop()
        {
            // If stack is empty: display a message , else: remove the last element
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            else {
                int[] temp = new int[--Size]; // Creating array on length of size+1
                for (int i = 0; i < Size; i++) {
                    temp[i] = stack[i];
                }
                int lastElement = stack[top--];
                stack=temp;
                return (lastElement);
            }
        }

        boolean empty() { return top == -1; }//Check if stack is empty



        // Printing the stack
        public String printStack()
        {
            String Ans = "";
            for (int i = 0; i < top; i++) {
                Ans += (stack[i]+" ");
            }
            Ans += stack[top];
            return Ans;
        }
    }



