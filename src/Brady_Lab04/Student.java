// Student.java
// IST 240 - Lab 04
// Zack Brady

public class Student extends Person {

    private int ID;
    private String degreeMajor;
    private double GPA;

    public Student(String firstName, String lastName, String homeTown, int age, int ID, String degreeMajor, double GPA) {
        super(firstName, lastName, homeTown, age);
        this.ID = ID;
        this.degreeMajor = degreeMajor;
        this.GPA = GPA;
    }

    public int getID() {
        return ID;
    }

    public String getdegreeMajor() {
        return degreeMajor;
    }

    public double getGPA() {
        return GPA;
    }

    public String getInfo() {
        return super.getInfo() + " " + getID() + "  " + getdegreeMajor() + " " + String.format("%.2f", getGPA());
    }
}