import java.util.Random;
import java.util.Scanner;

public class ReadAndSortGenerics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        GenericTree<String> stringTree = new GenericTree<>();
        GenericTree<Integer> integerTree = new GenericTree<>();
        
        while(in.hasNextLine())
            stringTree.add(in.nextLine());      
        stringTree.print();
        
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            integerTree.add(random.nextInt());      
        integerTree.print();
    }
}