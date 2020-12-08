// StudentAthlete.java
// IST 240 - Lab 04
// Zack Brady

public class StudentAthlete extends Student {

    private String Sports;
    private int Ranking;

    public StudentAthlete(String firstName, String lastName, String homeTown, int age, int ID, String degreeMajor, double GPA, String Sports, int Ranking) {
        super(firstName, lastName, homeTown, age, ID, degreeMajor, GPA);
        this.Sports = Sports;
        this.Ranking = Ranking;
    }
    
        public String getSports() {
        return Sports;
    }

    public int getRanking() {
        int Ranking = (int) (Math.random() * 100) + 0;
        return Ranking;
    }

    public String getInfo() {
        return super.getInfo() + " "+ getID() + "  " + getdegreeMajor() + " " + getGPA();
    }
}