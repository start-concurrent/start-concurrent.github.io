public abstract class Mammal extends Animal {
	public static final boolean MALE = false;
	public static final boolean FEMALE = true;
	private final boolean gender;
	
	public Mammal( boolean gender ) {
		super( true );
		this.gender = gender;
	}
	
	public getGender() { return gender; }	

	public abstract String makeSound();
}
