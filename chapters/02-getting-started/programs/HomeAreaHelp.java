public class HomeAreaHelp {
    private static double homeArea = 0.0;
    public static synchronized void updateHomeArea(double roomArea) {/*@\label{synchronizedUpdate}@*/
        homeArea = homeArea+roomArea;/*@\label{addRoomAreaToCurrentHomeArea}@*/
    }
    public static double getHomeArea() {
        return homeArea;/*@\label{returnHomeArea}@*/
    }
}   
