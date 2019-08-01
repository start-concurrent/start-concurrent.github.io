public class TowerOfHanoi {
    public static void main(String[] args) {
        move(4, 'A', 'C', 'B');
    }
    
    public static void move(int n, char fromPole, char toPole, char viaPole) {
        if(n == 1)
            System.out.format("Move disk from pole %c to pole %c.\n",
                fromPole, toPole);
        else {
            move(n - 1, fromPole, viaPole, toPole);
            move(1, fromPole, toPole, viaPole);
            move(n - 1, viaPole, toPole, fromPole);
        }
    }
}