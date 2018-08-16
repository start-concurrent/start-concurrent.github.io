import java.util.Arrays;
import java.util.Scanner;

public class ReadIntoFixedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[10];
        int n = 0;

        while( in.hasNextLine() )
            names[n++] = in.nextLine();
        
        Arrays.sort(names, 0, n);
        
        for( int i = 0; i < n; i++ )
            System.out.println(names[i]);
    }
}