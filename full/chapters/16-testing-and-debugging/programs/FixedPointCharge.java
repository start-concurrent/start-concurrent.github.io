public class FixedPointCharge {  
	private double charge;  // C
	private double x;		// m
	private double y;		// m
	private double z;		// m
	public static final double K = 8.9875517873681764e9; // N m^2 C^-2  

	public FixedPointCharge(double charge, double x, double y, double z) {
		this.charge = charge;    
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getCharge() { return charge; }

	public double distance(FixedPointCharge p) {
		return distance(p.x, p.y, p.z);
	} 

	private double distance(double x, double y, double z) {
		double deltaX = this.x - x;
		double deltaY = this.y - y;
		double deltaZ = this.z - z;    
		return Math.sqrt(deltaX*deltaX + deltaY*deltaY + deltaZ*deltaZ);      
	}

	public double scalarForce(FixedPointCharge p) {
		double r = distance(p);
		return K*charge*p.charge/(r*r);
	}

	public double fieldMagnitude(double x, double y, double z) {
		double r = distance(x, y, z);
		return K*charge/(r*r);
	}
}