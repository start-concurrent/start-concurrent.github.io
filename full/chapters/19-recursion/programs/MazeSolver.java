import java.util.Scanner;

public class MazeSolver {
    private char[][] maze; 			 			//<.>
    private final int ROWS, COLUMNS; 			//<.>

    public static void main(String[] args) {
        MazeSolver solver = new MazeSolver();	//<.>
        if(solver.solve(0, 0))
            System.out.println("\nSolved!");
        else
            System.out.println("\nNot solvable!");
        solver.print();							//<.>
    }   

    public MazeSolver() {
        Scanner in = new Scanner(System.in);	//<.>
        ROWS = in.nextInt();					//<.>
        COLUMNS = in.nextInt();
        in.nextLine();
        maze = new char[ROWS][COLUMNS];			//<.>
        for(int row = 0; row < ROWS; row++) {	//<.>
            String line = in.nextLine();
            System.out.println(line);
            for (int column = 0; column < COLUMNS; column++)
                maze[row][column] = line.charAt(column);
        }
    }

    public void print() {
        for(int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++)
                System.out.print(maze[row][column]);
            System.out.println();
        }
    }

    public boolean solve(int row, int column) {
		if(row < 0 || column < 0 || row >= ROWS || column >= COLUMNS)
			return false;
		else if(maze[row][column] == 'E')
			return true;
		else if(maze[row][column] != ' ')
			return false;
		else {
			maze[row][column] = '*';
			if(solve(row - 1, column) || solve(row + 1, column) ||
				solve(row, column - 1) || solve(row, column + 1))
				return true;
			else {
				maze[row][column] = ' ';
				return false;
			}
		}
    }
}