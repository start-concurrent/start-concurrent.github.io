public class Dog implements Ageable, Weighable {
    private int age;
    private double weight;  
    
    public Dog(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    
    public int getAge() { return age*7; }
    
    public double getWeight() { return weight; }
}