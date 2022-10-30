package class4.exs2;

public enum Birds {
    BLUEJAY("Blue bird")
            {
                @Override
                public void sing()
                {
                    System.out.println();
                }
            },
    FLAMINGO("Flamingo")
            {
                @Override
                public void sing()
                {
                    System.out.println("Sound like a honk");
                }
            },
    PARAKEET("Parakeet") {
        @Override
        public void sing() {
            System.out.println("Learn word and mimic sound");
        }
    },
    CROW("Crow")
            {
                @Override
                public void sing()
                {
                    System.out.println("Say cow-cow-koodle-yah");
                }
    };

Birds(String name)
{
    this.scientificName=name;
}
public final String scientificName;
    public abstract void sing();


    public static void main(String[] args) {
        System.out.println(Birds.PARAKEET.scientificName+" sounds:");
        Birds.PARAKEET.sing();

        System.out.println(Birds.CROW.scientificName+" sounds:");
        Birds.CROW.sing();



    }
}

