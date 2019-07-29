import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String name = in.next();
            int age = in.nextInt();
            map.put(name, age);
        }
    
        System.out.println("Keys");
        for(String name: map.keySet())
            System.out.println("\t" + name);
        
        System.out.println("Values");
        for(int age: map.values())
            System.out.println("\t" + age);
        
        for(Map.Entry<String, Integer> entry: map.entrySet())
			System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
