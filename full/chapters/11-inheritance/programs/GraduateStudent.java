public class GraduateStudent extends Student {
    private String topic; //<.>

    public GraduateStudent(String name, double GPA, String topic) {
        super(name, 4, GPA); //<.>
        setTopic(topic);
    }   

    public void setTopic(String topic) { this.topic = topic; }  

    public String toString() { //<.>
        return getName() + "\tGraduate\t" + getGPA() + "\tTopic: " + topic;
    }   
}