public class Person implements Ageable, Weighable {
	private int age;
	private double weight;	
	
	public Person( int age, double weight ) {
		this.age = age;
		this.weight = weight;
	}
	
	public int getAge() { return age; }
	
	public int getWeight() { return weight; }	
}