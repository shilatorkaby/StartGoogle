package class1;

public class EvenNumbers {
    protected void get_divided_mums(int[] args, int num) {
        System.out.println("for-each-loop");
        for (int i : args)
        {
            if (i%num == 0) { System.out.println(i);}
        }
        System.out.println("for-loop");
        for (int i=0; i<args.length; i++)
        {
            if (args[i]%num == 0) { System.out.println(args[i]);}
        }
        System.out.println("while-loop");
        int i=0;
        while (i<args.length)
        {
            if (args[i]%num == 0) { System.out.println(args[i]);}
            i++;
        }
    }

    protected void main(String[] args) {
        int[] arg={2,3,5,6,8};
        get_divided_mums(arg,2);
    }
}

// Outputs "I just got executed!"
