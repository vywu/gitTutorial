/**
 * Created by ethan on 2017-02-07.
 */
import java.util.List;
public class Student extends Person {
    String major;
    boolean fulltime;
    List<Course> courseList;

    public Student(String name, String emailAddress, String major, boolean fulltime) {
        super(name, emailAddress);
        this.major = major;
        this.fulltime=fulltime;
    }

    public String toString() {
        return String.format("Name: %s\nMajor: %s\nEmail: %s", this.name, this.major, this.emailAddress);
    }
    public void addCourse(Course c){
        courseList.add(c);
    }
}
