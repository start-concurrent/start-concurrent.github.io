import java.util.*;

public class StudentRoster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int students = in.nextInt();		//<.>
        Student[] roster = new Student[students]; //<.>
        for(int i = 0; i < roster.length; i++) { //<.>
            in.nextLine();          
            roster[i] = new Student(in.nextLine(), in.nextInt(), in.nextDouble());
        }
        sort(roster); //<.>
        for(int i = 0; i < roster.length; i++)
            System.out.println(roster[i]);
    }
    
    public static void sort(Student[] roster) {
        for(int i = 0; i < roster.length - 1; i++) {
            int smallest = i;
            for(int j = i + 1; j < roster.length; j++)
                if(roster[j].getGPA() < roster[smallest].getGPA())
                    smallest = j;
            Student temp = roster[smallest];
            roster[smallest] = roster[i];
            roster[i] = temp;
        }
    }
}
