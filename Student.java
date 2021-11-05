// Connor Cook, AP CSA Topic 2-1, 11-05-2021, 8:47am, v0.8

public class Student {
    // These are instance variables.
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

    // Sets specific values for some instance variables but allows input for others.
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gradeLevel = 9;
        this.GPA = 4.0;
    }

    // Multiple constuctors is known as overloading.

    public static void main(String[] args){
        Student student0 = new Student(); // Built with default constructor.
        Student student1 = new Student(12345678, 12, 3.5, "Darren"); // Built with value constructor.
        
    }

    // Parameters and Arguments

    public static void assignLunch(int gradeLevel) {
        String lunchPeriod;

        if (gradeLevel == 9) {
            lunchPeriod = "First Lunch";
            System.out.println("This student has " + lunchPeriod);
        } else if (gradeLevel == 10) {
            lunchPeriod = "Second Lunch";
            System.out.println("This student has " + lunchPeriod);
        } else if (gradeLevel == 11) {
            lunchPeriod = "Third Lunch";
            System.out.println("This student has " + lunchPeriod);
        } else {
            lunchPeriod = "Off-Campus Lunch";
            System.out.println("This student has " + lunchPeriod);
        }

    }

}