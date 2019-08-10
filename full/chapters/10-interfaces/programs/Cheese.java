public class Cheese implements Ageable, Weighable {
    private int age;
    private double weight;
    private String type;
    
    public Cheese(int age, double weight, String type) {
        this.age = age;
        this.weight = weight;
        this.type = type;
    }
    
    public int getAge() { return age; }
    
    public double getWeight() { return weight; }
    
    public String getType() { return type; }
}