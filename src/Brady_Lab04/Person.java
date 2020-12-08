// Person.java
// IST 240 - Lab 04
// Zack Brady

public class Person {

    private String firstName;
    private String lastName;
    private String homeTown;
    private int age;

    public Person(String firstName, String lastName, String homeTown, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeTown = homeTown;
        this.age = age;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String gethomeTown() {
        return homeTown;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return getName() + "  " + gethomeTown() + " " + getAge();
    }
}
