import java.util.Arrays;

public class DynamicArrayStack implements Stack {
    private String[] strings = new String[10];
    private int size = 0;
    
    public void push(String string) {
        if(size == strings.length)
            doubleArray();
        strings[size++] = string;
    }
    
    public String pop() {
        String value = null;
        if(size == 0)
            System.out.println("Can't pop empty stack!");
        else
            value = strings[--size];
        return value;
    }
	
	public String top() {
        String value = null;
        if(isEmpty())
            System.out.println("No top on an empty stack!");
        else
            value = strings[size - 1];
        return value;
    }
	
	public boolean isEmpty() {
		return size == 0;
	}

    private void doubleArray() {
        strings = Arrays.copyOfRange(strings, 0, strings.length*2);
    }
}