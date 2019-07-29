import java.util.Scanner;

public class UseDynamicArray {
    public static void main(String[] args) {
        DynamicArray names = new DynamicArray();        
        Scanner in = new Scanner(System.in);
        int count = 0;
        String line = null;
		
        while(in.hasNextLine()) {
            line = in.nextLine();
            names.set(count, line); //<.>
            count++;
        }
        
        names.sort(0, count); //<.>
        
        for(int i = 0; i < count; i++) //<.>
            System.out.println(names.get(i));
    }
}