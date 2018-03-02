import java.util.*;/*@\label{importUtilInAreaMeasuringRobotProgram}@*/
import javax.swing.*; 

public class AreaMeasuringRobot extends Thread {
    public static final String frameTitle = "Floor Area Measurement";
    private Random generator = new Random();
    private int floor;
    private double area;
    public AreaMeasuringRobot(int floor) {
        this.floor = floor; 
    }
    public double getArea() { return area; }
    public void run() {/*@\label{runMethodAreaMeasuringRobot}@*/
        double random = generator.nextDouble();/*@\label{generateRandomNumber}@*/
        area = random*400;/*@\label{findRoomArea}@*/      
    } 
    public static void main(String[] args) {
        AreaMeasuringRobot robot1 = new AreaMeasuringRobot(1);/*@\label{createLac1}@*/
        AreaMeasuringRobot robot2 = new AreaMeasuringRobot(2);/*@\label{createLac2}@*/
        robot1.start();/*@\label{startRobot}@*/
        robot2.start(); 
        try {
            lac1.join();/*@\label{waitForLac1ToFinish}@*/
            lac2.join();/*@\label{waitForLac2ToFinish}@*/
        } catch(InterruptedException e) // try-catch is explained in later chapters
        {}
        double total = robot1.getArea() + robot2.getArea();  /*@\label{computeTotalArea}@*/ 
        String message = "Home area is " + total + " square feet"; 
        JOptionPane.showMessageDialog(null, message, frameTitle, JOptionPane.INFORMATION_MESSAGE);/*@\label{displayHomearea}@*/
    }
}
