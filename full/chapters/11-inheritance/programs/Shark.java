public class Shark extends Fish {
    public void eat(Fish fish) {
        fish.die();
        feed();     
    }
}