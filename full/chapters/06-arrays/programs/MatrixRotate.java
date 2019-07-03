import java.util.*;

public class MatrixRotate {
    public static void main(String[] args) {
        double[] point = new double[3]; //<1>
        System.out.println("What point do you want to rotate?");
        Scanner in = new Scanner(System.in);
        System.out.print("x: "); //<2>
        point[0] = in.nextDouble();
        System.out.print("y: ");
        point[1] = in.nextDouble();
        System.out.print("z: ");
        point[2] = in.nextDouble();
        System.out.print("What angle around the x-axis? ");
        double theta = Math.toRadians(in.nextDouble()); //<3>
        double[][] rotation = new double[3][3];
        rotation[0][0] = 1; //<4>
        rotation[1][1] = Math.cos(theta);
        rotation[1][2] = -Math.sin(theta);
        rotation[2][1] = Math.sin(theta);
        rotation[2][2] = Math.cos(theta);
        double[] rotatedPoint = new double[3];
        for(int i = 0; i < rotatedPoint.length; i++) //<5>
            for(int j = 0; j < point.length; j++)
                rotatedPoint[i] += rotation[i][j]*point[j];
        System.out.println("Rotated point: [" + rotatedPoint[0] + //<6>
            "," + rotatedPoint[1] + "," + rotatedPoint[2] + "]");
    }
}