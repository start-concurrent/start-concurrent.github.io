import java.util.*; //<.>

public class MontyHall {
    public static void main(String[] args) {
        Random random = new Random();
        int winner = random.nextInt(3); //<.>
        Scanner in = new Scanner( System.in );
        System.out.print("Choose a door (enter 0, 1, or 2): ");
        int choice = in.nextInt(); //<.>
        int alternative; //<.>
        int open;

        if( choice == winner ) { //<.>
            int low;
            int high;
            if( choice ==  0 ) { //<.>
                low = 1;
                high = 2;
            }
            else if( choice == 1 ) {
                low = 0;
                high = 2;
            }
            else { //choice == 2
                low = 0;
                high = 1;
            }   
            //randomly choose between other two doors
            double threshold = random.nextDouble(); //<.>
            if( threshold < 0.5 ) { //<.>
                alternative = low;
                open = high;
            }
            else { //<.>
                alternative = high;
                open = low;
            }           
        }
        else { //<.>
            alternative = winner;
            if( choice == 0 ) { //<.>
                if( winner == 1 )                 
                    open = 2;               
                else
                    open = 1;               
            }
            else if( choice == 1 ) {
                if( winner == 0 )                   
                    open = 2;               
                else
                    open = 0;               
            }
            else { //choice == 2 
                if( winner == 0 )                       
                    open = 1;               
                else
                    open = 0;               
            }           
        }
        System.out.println("We have opened Door " + open + //<.>
            ", and there is junk behind it!");
        System.out.print("Do you want to change to Door " + //<.>
            alternative + " from Door " + choice +
            "? (Enter 'y' or 'n'): ");
        String change = in.next();      
        if( change.equals("y") )
            choice = alternative;
        System.out.println("You chose Door " + choice);
        if( choice == winner ) //<.>
            System.out.println("You win a pile of gold!");
        else
            System.out.println("You win a pile of junk.");
    }
}
