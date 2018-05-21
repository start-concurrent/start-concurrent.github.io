import java.util.*;

public class DragonAttributes {    
    public static void main(String[] args) {
    	Random random = new Random();/*@\label{createRandomNumberGeneratorLine}@*/
        int age = random.nextInt(100) + 1;/*@\label{generateAgeLine}@*/
        double height = random.nextDouble()*30;/*@\label{generateHeightLine}@*/
        boolean gender = random.nextBoolean();/*@\label{generateStatusLine}@*/
        int hitPoints = random.nextInt(51) + 25;
        System.out.println("Dragon Statistics");/*@\label{displayTurtleAttributesLine}@*/
        System.out.println("Age:\t\t" + age);
        System.out.format("Height:\t\t%.1f feet\n", height);
        System.out.println("Female:\t\t" + gender);
        System.out.println("Hit points:\t" + hitPoints);
    }
}