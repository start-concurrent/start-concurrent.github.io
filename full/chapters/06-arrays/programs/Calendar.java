import java.util.*;

public class Calendar {
    public static void main(String[] args) {
        String[][] squares = new String[7][7]; //<1>
        squares[0][0] = "Sun"; //<2>
        squares[0][1] = "Mon";
        squares[0][2] = "Tue";
        squares[0][3] = "Wed";
        squares[0][4] = "Thu";
        squares[0][5] = "Fri";
        squares[0][6] = "Sat";
        for(int i = 1; i < squares.length; i++) //<3>
            for(int j = 0; j < squares[i].length; j++)
                squares[i][j] = " ";        
        Scanner in = new Scanner(System.in);
        System.out.print("Which day does your month start on? (0 - 6) ");
        int start = in.nextInt(); //read starting day <4>
        System.out.print("How many days does your month have? (28 - 31) ");
        int days = in.nextInt();  //read days in month <5>
        int day = 1;
        int row = 1;
        int column = start; 
        while(day <= days) { //fill calendar <6>
            squares[row][column] = "" + day;
            day++;
            column++;
            if(column >= squares[row].length) {
                column = 0;
                row++;
            }
        }
        for(int i = 0; i < squares.length; i++) { //<7>
            for(int j = 0; j < squares[i].length; j++)
                System.out.print(squares[i][j] + "\t");
            System.out.println();
        }
    }
}
