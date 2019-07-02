public class SplitExpression {
    public static void main(String[] args) {
        ComputeF fThread = new ComputeF(3.14, 2.99); // <.>
        ComputeG gThread = new ComputeG(5.55); // <.>
        fThread.start(); // <.>
        gThread.start(); // <.>
        try {
            fThread.join();  // <.>
            gThread.join(); // <.>
            double fResult = fThread.getResult(); // <.>
            double gResult = gThread.getResult(); // <.>
            double answer = fResult*gResult; // <.>
            System.out.println("Result of f: " + fResult );
            System.out.println("Result of g: " + gResult );
            System.out.println("Final answer: " + answer);        
        }
        catch(InterruptedException e){
            System.out.println("Computation interrupted!");
        }             
    }   
}
