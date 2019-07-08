import java.util.*;

public class TwentyQuestions {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);      
        System.out.print("Is it an animal, vegetable, or mineral? (a, v, or m): ");
        String response = in.next().toLowerCase();
        if(response.equals("a")) {
            System.out.print("Is it a mammal? (y or n): ");
            response = in.next().toLowerCase();
            if(response.equals("y")) {
                System.out.print(
                    "Does it live on land? (y or n): ");
                response = in.next().toLowerCase();
                if(response.equals("y"))
                    System.out.println("It's a human.");                
                else // Assume "n"
                    System.out.println("It's a dolphin.");              
            }
            else { // Assume "n"
                System.out.print("Does it fly? (y or n): ");
                response = in.next().toLowerCase();
                if(response.equals("y"))
                    System.out.println("It's an eagle.");               
                else // Assume "n"
                    System.out.println("It's a lizard.");
            }
        }
        else if(response.equals("v")) {
            System.out.print("Is it a fruit? (y or n): ");
            response = in.next().toLowerCase();
            if(response.equals("y")) {
                System.out.print(
                    "Does it grown on a vine? (y or n): ");
                response = in.next().toLowerCase();
                if(response.equals("y"))
                    System.out.println("It's a tomato.");               
                else // Assume "n"
                    System.out.println("It's a peach.");                
            }
            else { // Assume "n"
                System.out.print("Is it a tree? (y or n): ");
                response = in.next().toLowerCase();
                if(response.equals("y"))
                    System.out.println("It's a maple tree.");
                else // Assume "n"
                    System.out.println("It's a potato.");
            }
        }
        else { // Assume "m"
                System.out.print(
                    "Is it the hardest mineral? (y or n): ");
                response = in.next().toLowerCase();
                if(response.equals("y"))
                    System.out.println("It's a diamond.");              
                else // Assume "n"
                    System.out.println("It's lead.");
        }       
    }
}