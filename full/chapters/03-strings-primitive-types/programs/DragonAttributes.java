import java.util.*; // <.>

public class DragonAttributes {    
    public static void main(String[] args) {
        Random random = new Random(); // <.>
        int age = random.nextInt(100) + 1; // <.>
        double height = random.nextDouble()*30; // <.>
        boolean gender = random.nextBoolean(); // <.>
        int hitPoints = random.nextInt(51) + 25; // <.>
        System.out.println("Dragon Statistics");
        System.out.println("Age:\t\t" + age);
        System.out.format("Height:\t\t%.1f feet\n", height);
        System.out.println("Female:\t\t" + gender);
        System.out.println("Hit points:\t" + hitPoints);
    }
}