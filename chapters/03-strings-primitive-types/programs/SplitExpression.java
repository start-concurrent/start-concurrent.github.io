public class SplitExpression {
    public static void main(String[] args) {
        ComputeF fThread = new ComputeF(3.14, 2.99); // <1>
        ComputeG gThread = new ComputeG(5.55); // <2>
        fThread.start(); // <3>
        gThread.start(); // <4>
        try {
            fThread.join();  // <5>
            gThread.join(); // <6>
            double fResult = fThread.getResult(); // <7>
            double gResult = gThread.getResult(); // <8>
            double answer = fResult*gResult; // <9>
            System.out.println("Result of f: " + fResult );
            System.out.println("Result of g: " + gResult );
            System.out.println("Final answer: " + answer);        
        }
        catch(InterruptedException e){
        	System.out.println("Computation interrupted!");
        }             
    }   
}
