public interface AbstractStaticGuitarist {
    void strumChord(Chord chord);
    void playMelody(Melody notes);
    static int getStrings();
}