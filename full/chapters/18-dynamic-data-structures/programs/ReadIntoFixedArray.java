import java.util.Arrays;
import java.util.Scanner;

public class ReadIntoFixedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[10];
        int count = 0;

        while(in.hasNextLine())
            names[count++] = in.nextLine();
        
        Arrays.sort(names, 0, count);
        
        for(String name: names) //<.>
            System.out.println(name);
    }
}