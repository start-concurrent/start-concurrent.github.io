import java.util.*;

public class TwentyQuestions {
    public static void main(String[] args) {                
        Scanner in = new Scanner( System.in );      
        System.out.print("Is it an animal, vegetable, or mineral?" +
            "('a', 'v', or 'm'): ");
        String response = in.next().toLowerCase();
        if( response.equals("a") ) {
            System.out.print("Is it a mammal? ('y' or 'n'): ");
            response = in.next().toLowerCase();
            if( response.equals("y") ) {
                System.out.print(
                    "Does it live on land? ('y' or 'n'): ");
                response = in.next().toLowerCase();
                if( response.equals("y") )
                    System.out.println("It's a human.");                
                else //assume "n"
                    System.out.println("It's a dolphin.");              
            }
            else { //assume "n"
                System.out.print("Does it fly? ('y' or 'n'): ");
                response = in.next().toLowerCase();
                if( response.equals("y") )
                    System.out.println("It's an eagle.");               
                else //assume "n"
                    System.out.println("It's a lizard.");
            }
        }
        else if( response.equals("v") ) {
            System.out.print("Is it a fruit? ('y' or 'n'): ");
            response = in.next().toLowerCase();
            if( response.equals("y") ) {
                System.out.print(
                    "Does it grown on a vine? ('y' or 'n'): ");
                response = in.next().toLowerCase();
                if( response.equals("y") )
                    System.out.println("It's a tomato.");               
                else //assume "n"
                    System.out.println("It's a peach.");                
            }
            else { //assume "n"
                System.out.print("Is it a tree? ('y' or 'n'): ");
                response = in.next().toLowerCase();
                if( response.equals("y") )
                    System.out.println("It's a maple tree.");
                else //assume "n"
                    System.out.println("It's a potato.");
            }
        }
        else { //assume "m"
                System.out.print(
                    "Is it the hardest mineral? ('y' or 'n'): ");
                response = in.next().toLowerCase();
                if( response.equals("y") )
                    System.out.println("It's a diamond.");              
                else //assume "n"
                    System.out.println("It's lead.");
        }       
    }
}