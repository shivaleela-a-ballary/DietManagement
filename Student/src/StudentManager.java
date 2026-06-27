import java.util.ArrayList;

class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(int id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added!");
    }

    void displayStudents() {
        for (Student s : students) {
            s.display();
        }
    }
}