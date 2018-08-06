import java.util.*; // <1>

public class DragonAttributes {    
    public static void main(String[] args) {
    	Random random = new Random(); // <2>
        int age = random.nextInt(100) + 1; // <3>
        double height = random.nextDouble()*30; // <4>
        boolean gender = random.nextBoolean(); // <5>
        int hitPoints = random.nextInt(51) + 25; // <6>
        System.out.println("Dragon Statistics");
        System.out.println("Age:\t\t" + age);
        System.out.format("Height:\t\t%.1f feet\n", height);
        System.out.println("Female:\t\t" + gender);
        System.out.println("Hit points:\t" + hitPoints);
    }
}