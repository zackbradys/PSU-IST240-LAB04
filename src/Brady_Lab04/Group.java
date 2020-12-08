// Group.java
// IST 240 - Lab 03
// Zack Brady

public class Group {

    private String GroupName;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;

    public Group(String GroupName, Student student1, Student student2, Student student3, Student student4) {
        this.GroupName = GroupName;
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
        this.student4 = student4;
    }

    public String getGroupName() {
        return GroupName;
    }

    public Student getStudent1() {
        return student1;
    }

    public Student getStudent2() {
        return student2;
    }

    public Student getStudent3() {
        return student3;
    }

    public Student getStudent4() {
        return student4;
    }
    
    public void getGroupInfo() {
        System.out.println("Group Name: " + getGroupName());
        System.out.println("Student 1: " + student1.getName() + " | Age: " + student1.getAge()+ " | GPA: " + (String.format("%.2f", student1.getGPA())));
        System.out.println("Student 2: " + student2.getName() + " | Age: " + student2.getAge()+ " | GPA: " + (String.format("%.2f", student2.getGPA())));
        System.out.println("Student 3: " + student3.getName() + " | Age: " + student3.getAge()+ " | GPA: " + (String.format("%.2f", student3.getGPA())));
        System.out.println("Student 4: " + student4.getName() + " | Age: " + student4.getAge()+ " | GPA: " + (String.format("%.2f", student4.getGPA())));
    }
    
    public double groupSemesterAverage() {
        double GroupAverage = (student1.getGPA() + student2.getGPA() + student3.getGPA() + student4.getGPA()) / 4;
        return GroupAverage;
    }
}
