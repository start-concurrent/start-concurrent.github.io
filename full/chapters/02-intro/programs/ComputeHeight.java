public class ComputeHeight {
    public static void main(String[] args) {
        // Use dummy values to test subproblem 2
        double height = 15, coefficient = 0.3;
        int bounces = 10;
        // Compute height after bounces
        double bounceHeight = height*Math.pow(coefficient,bounces);
        System.out.println(bounceHeight); // For testing
    }
}
