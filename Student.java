import java.util.Scanner;

// Connor Cook, AP CSA Unit 2, 11-19-2021, 8:57am, v1.5

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

        mathPractice();
    }

}