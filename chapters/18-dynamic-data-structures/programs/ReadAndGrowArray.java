import java.util.Arrays;
import java.util.Scanner;

public class ReadAndGrowArray {
	public static void main(String[] args) {
		String[] names = new String[10];
		Scanner in = new Scanner(System.in);
		int n = 0;
		String name = null;
		
		while (in.hasNextLine()) {
			name = in.nextLine();
			try {
				names[n] = name;
			}
			catch( ArrayIndexOutOfBoundsException e ) { // <1>
				names = Arrays.copyOfRange(names, 0, names.length*2); // <2>
				names[n] = name;
			}
			n++;
		}
		
		Arrays.sort(names, 0, n);
		
		for (int i = 0; i < n; i++)
			System.out.println(names[i]);
	}
}