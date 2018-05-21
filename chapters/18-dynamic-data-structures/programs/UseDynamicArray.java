import java.util.Scanner;

public class UseDynamicArray {
    public static void main(String[] args) {
        DynamicArray names = new DynamicArray();
        
        Scanner in = new Scanner(System.in);
        int n = 0;
        String name = null;
        while (in.hasNextLine()) {
            name = in.nextLine();
            names.set(n, name);
            n++;
        }
        
        names.sort(0, n);
        
        for (int i = 0; i < n; i++)
            System.out.println(names.get(i));
    }
}