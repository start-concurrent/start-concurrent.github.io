import java.util.Scanner;

public class Gravity {
    public static final double G = 6.673e-11;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the first mass?");
        double m1 = in.nextDouble();
        System.out.println("What is the second mass?");
        double m2 = in.nextDouble();
        System.out.println("What is the distance between them?");
        double r = in.nextDouble();
        System.out.println("The force of gravity is " + force(m1, m2, r) + " N");
    }

    public static double force(double m1, double m2, double r) {    
        return G*m1*m2/(r*r);
    }
}
