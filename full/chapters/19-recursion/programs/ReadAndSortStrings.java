import java.util.Scanner;

public class ReadAndSortStrings {
	public static void main(String[] args) {
		Tree tree = new Tree();
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine())           
			tree.add(in.nextLine());        
		tree.print();
	}
}