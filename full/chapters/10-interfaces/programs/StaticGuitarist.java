public interface StaticGuitarist {
    void strumChord( Chord chord );
    void playMelody( Melody notes );
    static int getStrings();
}