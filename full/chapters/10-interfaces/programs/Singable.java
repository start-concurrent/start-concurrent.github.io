public interface Singable {
    public int SOPRANO = 1;
    public static int ALTO = 2;

    public void sing();
    private String chant();
    public boolean hasDeepVoice() {
        return false;
    }
    public static boolean hasPerfectPitch();
    public synchronized void tune(int frequency);
}