import java.util.Scanner;

// Connor Cook, AP CSA Unit 2, 12-06-2021, 8:58am, v1.9

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

    // Creating methods
    public static void calcGPA() {
        int grade0;
        int grade1;
        int grade2;
        int grade3;
        double newGPA;


        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the first grade?");
        grade0 = myScanner.nextInt();
        System.out.println("What is the second grade?");
        grade1 = myScanner.nextInt();
        System.out.println("What is the third grade?");
        grade2 = myScanner.nextInt();
        System.out.println("What is the fourth grade?");
        grade3 = myScanner.nextInt();

        newGPA = (grade0 + grade1 + grade2 + grade3) / 4;
        System.out.println("The new GPA is " + newGPA);
    }

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
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

    // Multiple parameters
    public static void assignLunchMultiple(int gradeLevel, double GPA) {
        String lunchPeriod;
        // Boolean operators
        // && is and
        // || is or
        // ! is not

        if (gradeLevel == 9 || GPA <= 1.5) {
            lunchPeriod = "First Lunch";
            System.out.println("This student has " + lunchPeriod);
        } else if (gradeLevel == 10 && GPA > 2.0) {
            lunchPeriod = "Second Lunch";
            System.out.println("This student has " + lunchPeriod);
        } else if (gradeLevel == 11 && (GPA != 0.0)) {
            lunchPeriod = "Third Lunch";
            System.out.println("This student has " + lunchPeriod);
        } else {
            lunchPeriod = "Off-Campus Lunch";
            System.out.println("This student has " + lunchPeriod);
        }
    }

    // Math
    public static void mathPractice() {
        int x;
        int y;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer for x. ");
        x = myScanner.nextInt();
        System.out.print("Enter another integer for y. ");
        y = myScanner.nextInt();
        System.out.println(Math.min(x, y));
        // Way to save the lowest value for use later in code.
        int lowest;
        lowest = Math.min(x, y);
        System.out.println(lowest);
        
        System.out.println("Next x will be calculated to the power of y.");
        System.out.println(Math.pow(x, y));
        // Way to save the calculated power of x to the y for later use in code.
        double exponents;
        exponents = Math.pow(x, y);
        System.out.println(exponents);

        System.out.println("Next 2 random numbers will be generated between 0 and 1.");
        System.out.println(Math.random());
        // Way to save the random number for use later in the code.
        double randomPercent;
        randomPercent = Math.random();
        System.out.println(randomPercent);

        System.out.println("Next the square root of x will be calculated.");
        System.out.println(Math.sqrt(x));
        //Way to save the sqrt for later use in the code.
        double sqrtX;
        sqrtX = Math.sqrt(x);
        System.out.println(sqrtX);
    }

    // Return methods
    public static double getGPA() {
        int grade0, grade1, grade2;
        grade0 = 75;
        grade1 = 50;
        grade2 = 0;

        double fakeGPA;
        fakeGPA = (grade0 + grade1 + grade2) / 3;

        return fakeGPA;
    }

    public static String getStudentName() {
        String studentName;
        studentName = "Jeff";

        String fakeStudent;
        fakeStudent = studentName;

        return fakeStudent;
    }

    public static void main(String[] args) {
        
        /*Student student0 = new Student(); // Built with default constructor.
        Student student1 = new Student(12345678, 12, 3.5, "Darren"); // Built with value constructor.

        System.out.println("Hello there!");
        threeLine();
        System.out.println("General Kenobi");
        calcGPA();

        assignLunch(9);
        assignLunchMultiple(11, 3.0);
        */

        // mathPractice();

        /*double realGPA;
        realGPA = -1.0;
        System.out.println(realGPA);
        realGPA = getGPA();
        System.out.println(realGPA);
        */

        String realStudent;
        realStudent = "Bobby";
        System.out.println(realStudent);
        realStudent = getStudentName();
        System.out.println(realStudent);
    }

}