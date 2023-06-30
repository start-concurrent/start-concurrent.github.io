public class MatrixThread extends Thread {
    private double[][] a;
    private double[][] b;
    private double[][] c;
    private int lower;
    private int upper;  
    
    public MatrixThread(double[][] a, double[][] b, //<.>
        double[][] c, int lower, int upper) {      
        this.a = a;
        this.b = b;
        this.c = c;
        this.lower = lower;
        this.upper = upper;
    }
    
    public void run() { //<.>
        for(int i = lower; i < upper; i++)
            for(int j = 0; j < c[i].length; j++)              
                for(int k = 0; k < b.length; k++)
                    c[i][j] += a[i][k] * b[k][j];
    }
}
