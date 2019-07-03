public class Life {
    public static void main(String[] args) {
        final int ROWS = 24;        //<.>
        final int COLUMNS = 80;     
        final int GENERATIONS = 500;
        boolean[][] board = new boolean[ROWS][COLUMNS]; //<.>
        boolean[][] temp = new boolean[ROWS][COLUMNS];
        boolean[][] swap;
        for(int row = 0; row < ROWS; row++) //<.>
            for(int column = 0; column < COLUMNS; column++)
                board[row][column] = (Math.random() < 0.1);
        for(int generation = 0; generation < GENERATIONS; generation++) { //<.>
            for(int row = 0; row < ROWS; row++) //<.>
                for(int column = 0; column < COLUMNS; column++) {
                    int total = 0;
                    for(int i = Math.max(row - 1, 0); //<.>
						i < Math.min(row + 2, ROWS); i++)
                        for(int j = Math.max(column - 1, 0);
							j < Math.min(column + 2, COLUMNS); j++)
                            if((i != row || j != column) && board[i][j])
                                total++;
                    if(board[row][column])
                        temp[row][column] = (total == 2 || total == 3); //<.>
                    else
                        temp[row][column] = (total == 3); //<.>
                }
            swap = board; //<.>
            board = temp;
            temp = swap;
            for(int i = 0; i < 100; i++) //<.>
                System.out.println();                   
            for(int row = 0; row < ROWS; row++) { //<.>
                for(int column = 0; column < COLUMNS; column++)
                    if(board[row][column])
                        System.out.print("*");
                    else
                        System.out.print(" ");
                System.out.println();
            }           
            try { Thread.sleep(500); } //<.>
            catch(InterruptedException e) {}
        }
    }
}