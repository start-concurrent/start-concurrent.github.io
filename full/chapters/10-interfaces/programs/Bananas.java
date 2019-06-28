public class Bananas implements Priceable {
    public static final double PRICE_PER_POUND = 0.49;
    private double weight;
    
    public Bananas(double weight) { this.weight = weight; }

    public double getPrice() {
        return weight*PRICE_PER_POUND;
    }
}