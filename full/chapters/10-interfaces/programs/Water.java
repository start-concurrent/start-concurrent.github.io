public class Water implements Priceable {
    public static final double PRICE_PER_GALLON = 0.99; 
    private int gallons;    

    public Water(int gallons) { this.gallons = gallons; }     

    public double getPrice() { return gallons*PRICE_PER_GALLON; }
}
