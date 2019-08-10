public class Cat implements Ageable, Weighable {
    private int age;
    private double weight;  
    
    public Cat(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    
    public int getAge() { return age/9; }
    
    public double getWeight() { return weight; }   
}