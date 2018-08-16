import java.util.Arrays;

public class DynamicArrayStack implements Stack {
    private String[] strings = new String[10];
    private int size = 0;
    
    public void push(String string) {
        if( size == strings.length )
            doubleArray();
        strings[size++] = string;
    }
    
    public String pop() {
        String value = null;
        if (size == 0)
            System.out.println("Can't pop empty stack!");
        else
            value = strings[--size];
        return value;
    }

    private void doubleArray() {
        strings = Arrays.copyOfRange(strings, 0, strings.length*2);
    }
}