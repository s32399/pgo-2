package src;
import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public List<Double> grades;

    public Student(String fname, String lname, int indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = new ArrayList<>();
    }
}
