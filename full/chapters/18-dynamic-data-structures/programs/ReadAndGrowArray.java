import java.util.Arrays;
import java.util.Scanner;

public class ReadAndGrowArray {
    public static void main(String[] args) {
        String[] names = new String[10];
        Scanner in = new Scanner(System.in);
        int count = 0;
        String line = null;
        
        while(in.hasNextLine()) {
            line = in.nextLine();
            try {
                names[count] = line;
            }
            catch(ArrayIndexOutOfBoundsException e) { // <.>
                names = Arrays.copyOfRange(names, 0, names.length*2); // <.>
                names[count] = line;
            }
            count++;
        }
        
        Arrays.sort(names, 0, count);
        
        for(String name: names)
            System.out.println(name);
    }
}