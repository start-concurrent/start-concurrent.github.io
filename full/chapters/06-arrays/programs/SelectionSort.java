import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //<.>
        int[] values = new int[n]; //<.>
        int smallest;
        int temp;
        for(int i = 0; i < values.length; i++) //<.>
            values[i] = in.nextInt();
        for(int i = 0; i < n - 1; i++) { //<.>
            smallest = i;
            for(int j = i + 1; j < n; j++) //<.>
                if(values[j] < values[smallest])
                    smallest = j; //<.>
            temp = values[smallest]; //<.>
            values[smallest] = values[i];
            values[i] = temp;
        }
        System.out.print("The sorted list is: ");
        for(int i = 0; i < values.length; i++) //<.>
            System.out.print(values[i] + " ");
    }
}