public class Eggs implements Priceable {
    public static final double PRICE_PER_DOZEN_LARGE = 1.5;
    public static final double PRICE_PER_DOZEN_EXTRA_LARGE = 1.75;
    private int dozens;
    private boolean extraLarge;
    
    public Eggs(int dozens, boolean extraLarge) {
        this.dozens = dozens;
        this.extraLarge = extraLarge;
    }       

    public double getPrice() {
        if(extraLarge)
            return dozens*PRICE_PER_DOZEN_EXTRA_LARGE;
        else
            return dozens*PRICE_PER_DOZEN_LARGE;            
    }
}