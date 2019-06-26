public class Bookkeeper {
    public static int counter = 0;

    public static void main(String[] args) {
        while(Math.random() > 0.001)
            record();

        System.out.println("Record was called " + counter + " times.");
    }

    public static void record() {   
        counter++;  
    }
}