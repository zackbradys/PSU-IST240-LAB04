// App.java
// IST 240 - Lab 04
// Zack Brady

public class App {

    public static void main(String args[]) {
        StudentAthlete studentathlete1 = new StudentAthlete("Jeremy", "Robbins", "College Park, PA", 24, 192837465, "Communications", 3.78, "Football, Soccer, and Track", 3);
        
        System.out.println("Name: " + studentathlete1.getName());
        System.out.println("Hometown: " + studentathlete1.gethomeTown());
        System.out.println("Age: " + studentathlete1.getAge());
        System.out.println("ID: " + studentathlete1.getID());
        System.out.println("Major: " + studentathlete1.getdegreeMajor());
        System.out.println("GPA: " + studentathlete1.getGPA());
        System.out.println("Sports: " + studentathlete1.getSports());
        System.out.println("Ranking: " + studentathlete1.getRanking());

    }
}
