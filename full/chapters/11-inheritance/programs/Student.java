public class Student {
    public static final String[] YEARS = {"Freshman", "Sophomore", "Junior", "Senior"};
    private String name;
    private int year;
    private double GPA;

    public Student(String name, int year, double GPA) {
        setName(name);
        setYear(year);
        setGPA(GPA);
    }   

    public void setName(String name) { this.name = name; }  
    public void setYear(int year) { this.year = year; }

    public void setGPA(double GPA) {
        if(GPA >= 0 && GPA <= 4.0)
            this.GPA = GPA;
        else
            System.out.println("Invalid GPA: " + GPA);      
    }

    public String getName() { return name; };
    public int getYear() { return year; };
    public double getGPA() { return GPA; };

    public String toString() {
        return name + "\t" + YEARS[year] + "\t" + GPA;
    }   
}