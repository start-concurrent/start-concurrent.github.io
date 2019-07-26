public class Human extends Mammal {
    public Human(boolean gender, boolean happy) {
        super(gender);
        setHappy(happy);
    }

    public String makeSound() {
        return "Hello, world.";
    }
}