public class SplitExpression {
    public static void main(String[] args) {
        ComputeF fThread = new ComputeF(3.14, 2.99);/*@\label{createFLine}@*/
        ComputeG gThread = new ComputeG(5.55);/*@\label{createGLine}@*/
        fThread.start();/*@\label{startFComputationLine}@*/
        gThread.start();/*@\label{startGComputationLine}@*/
        try {
            fThread.join();  /*@\label{waitForFToFiniLinesh}@*/
            gThread.join(); /*@\label{waitForGToFiniLinesh}@*/
            double fResult = fThread.getResult();/*@\label{getResultFromFLine}@*/ 
            double gResult = gThread.getResult();/*@\label{getResultFroLineG}@*/ 
            double answer = fResult*gResult;/*@\label{computeFinalValueLine}@*/ 
            System.out.println("Result of f: " + fResult );
            System.out.println("Result of g: " + gResult );
            System.out.println("Final answer: " + answer);        
        }
        catch(InterruptedException e){
        	System.out.println("Computation interrupted!");
        }             
    }   
}
