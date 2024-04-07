package src;
import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String name;
    public List<Student> students;

    public StudentGroup(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Grupa jest pełna.");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Ten student należy do tej grupy.");
        }
        students.add(student);
    }

    public double calculateAvg() {
        if (students.isEmpty()) {
            throw new IllegalArgumentException("Brak ocen.");
        }

        double sum = 0;
        for (Student student : students) {
            for (double grade : student.grades) {
                sum += grade;
            }
        }

        double avg = sum / students.size();
        avg = Math.round(avg * 2) / 2.0;;
        return avg;
    }
}
