public interface ConstantGuitarist {    
    static final int MAJOR = 1;
    static final int NATURAL_MINOR = 2;
    static final int HARMONIC_MINOR = 3;
    static final int MELODIC_MINOR = 4;
    static final int CHROMATIC = 5;
    static final int PENTATONIC = 6;    

    void strumChord(Chord chord);
    void playMelody(Melody notes);    
}