public class Shadow {
    int darkness = 10;

    public void deepen(int darkness) {
        darkness += darkness;
        if(darkness > 100)
            darkness = 100;
    }

    public int getDarkness() { return darkness; }
}