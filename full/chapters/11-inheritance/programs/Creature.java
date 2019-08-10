public class Creature implements Ageable, Weighable {
    protected int age;
    protected double weight;
    
    public Creature(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    
    public int getAge() { return age; }    
    public double getWeight() { return weight; }
}