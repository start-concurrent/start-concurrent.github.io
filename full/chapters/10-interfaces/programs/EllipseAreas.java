public class EllipseAreas {
	
	public static void main(String[] args) {
		createEllipses();
	}
	
	public static double sumAreas(AreaGettable[] shapes) {
		double sum  = 0.0;
		for(int i = 0; i < shapes.length; i++)
			sum += shapes[i].getArea();

		return sum;
	}	
	
	public static void createEllipses() {
		AreaGettable[] ellipses = new AreaGettable[100];

		for(int i = 0; i < 100; i++) {
			final double value1 = Math.random() * 25.0;
			final double value2 = Math.random() * 25.0;

			ellipses[i] = new AreaGettable() {
				private double axis1 = value1;
				private double axis2 = value2;

				public double getArea() {
					return Math.PI*0.5*axis1*0.5*axis2;
				}
			};
		}

		double sum = sumAreas(ellipses);
		System.out.println("The total area is " + sum);
	}
}
