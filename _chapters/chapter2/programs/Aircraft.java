import java.util.*;/*@\label{importUtilInAircraftProgram}@*/
import javax.swing.*;/*@\label{importSwingInAircraftProgram}@*/

public class Aircraft {/*@\label{classAircraftBegin}@*/
    private String manufacturer, model;/*@\label{sampleDeclarationStatement}@*/    
    private String status;
    public static final String title = "Aircraft Class Example";
    
    public Aircraft(String manufacturer, String model, String status) {/*@\label{classConstructorAircraftBegin}@*/
        this.manufacturer = manufacturer;
        this.model = model;
        this.status = status;
    }/*@\label{classConstructorAircraftEnd}@*/
    
    public void fly() {/*@\label{classAircraftMethodFlyBegin}@*/ 
        status = "flying";
        String message = model + " is flying.";
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }/*@\label{classAircraftMethodFlyEnd}@*/ 
    
    public static void main(String[] args) {/*@\label{classAircraftMethodMainBegin}@*/ 
        Aircraft plane1 = new Aircraft("Boeing", "777-206", "on the ground");/*@\label{createObjectmyAircraft}@*/ 
        Aircraft plane2 = new Aircraft("Lockheed", "1049G", "on the ground");/*@\label{createObjectherAircraft}@*/
        plane1.fly();/*@\label{flymyAircraft}@*/
        plane2.fly();/*@\label{flyherAircraft}@*/
    }/*@\label{classAircraftMethodMainEnd}@*/ 
}/*@\label{classAircraftEnd}@*/