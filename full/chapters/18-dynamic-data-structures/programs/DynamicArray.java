import java.util.Arrays;

public class DynamicArray {
    private String[] strings = new String[10];
   
    public synchronized void set(int i, String string) {
        if(i == strings.length)
            strings = Arrays.copyOfRange(strings, 0, strings.length*2);
        strings[i] = string;
    }
    
    public String get(int i) {
        return strings[i];
    }
    
    public synchronized void sort(int first, int last) {
        Arrays.sort(strings, first, last);
    }
}