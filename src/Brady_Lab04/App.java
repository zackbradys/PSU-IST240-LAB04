// App.java
// IST 240 - Lab 03
// Zack Brady

public class App {

    public static void main(String args[]) {
        Student student1 = new Student("John", "Boxer", 28);
        Student student2 = new Student("Mary", "Ellison", 19);
        Student student3 = new Student("Emily", "Lakewood", 36);
        Student student4 = new Student("Peter", "Zander", 22);

        Group group1 = new Group("Nittany Lions", student1, student2, student3, student4);
        group1.getGroupInfo();
        System.out.println("");
        System.out.println("Semester GPA for the Group: " + String.format("%.2f", group1.groupSemesterAverage()));
        System.out.println("Student 3's Semester GPA: " + String.format("%.2f", student3.getGPA()));
        
        System.out.println("");
        System.out.println("");
        
        Student student5 = new Student("George", "Thomas", 18);
        Student student6 = new Student("Kelsie", "Delanie", 31);
        Student student7 = new Student("Robert", "Yankee", 24);
        Student student8 = new Student("Michela", "Bonfire", 29);
        
        Group group2 = new Group("Penn. State Scholars", student5, student6, student7, student8);
        group2.getGroupInfo();
        System.out.println("");
        System.out.println("Semester GPA for the Group: " + String.format("%.2f", group2.groupSemesterAverage()));
        System.out.println("Student 3's Semester GPA: " + String.format("%.2f", student7.getGPA()));
        
    }
}
