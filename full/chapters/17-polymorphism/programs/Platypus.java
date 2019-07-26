public class Platypus extends Mammal {
    public Platypus(boolean gender) {
        super(gender);
    }

    public String makeSound() {
        return "Quack!";
    }   
    
    public Egg layEgg() {
        if(getGender() == FEMALE)
            return new Egg();
        else
            return null;
    }
    
    public void poison(Animal victim) {
        if(getGender() == MALE)
            victim.setHappy(false);                           
    }
}