import java.util.Arrays;
import java.util.Scanner;

public class UseGenericLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GenericLinkedList<String> list = new GenericLinkedList<String>();
        
        while(in.hasNextLine())
            list.add(in.nextLine());
        
        String[] names = new String[list.size()]; 
        list.fillArray(names);
        
        Arrays.sort(names);
        
        for(String name: names)
            System.out.println(name);
    }
}
