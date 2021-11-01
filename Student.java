// Connor Cook, AP CSA Topic 2-1, 11-01-2021, 9:14am, v0.6

public class Student {
    private int studentID;
    private int gradeLevel;
    private double GPA;
    private String studentName;

    // Creating a constructor. Generally creates a default copy of the object.
    public Student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.GPA = 0.0;
        this.studentName = "";
    }

    // Value constructor. Assigns values to the instance variables in the other constructor.
    public Student(int studentID, int gradeLevel, double GPA, String studentName) {
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
        this.studentName = studentName;
}

    public static void main(String[] args){
        Student student0 = new Student();
        Student student1 = new Student(12345678, 12, 3.5, "Darren");
        
    }



}