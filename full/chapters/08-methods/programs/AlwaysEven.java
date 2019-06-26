public class AlwaysEven {
    private static int value = 1;

    public static void print() {        
        value++; //<.>
        if(value % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        value++; //<.>
    }
}