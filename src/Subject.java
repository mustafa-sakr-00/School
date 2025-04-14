import java.util.ArrayList;

public class Subject {
    String name;
    Teacher teacher;
    ArrayList<Student> students = new ArrayList<>();

    String getStudentsString() {
        String s = "";
        for (int i = 0; i < students.size(); i++) {
            s += i + ": " + students.get(i).name;
            s += "\n";
        }
        return s;
    }

    @Override
    public String toString() {
        String s = "";
        s += name;
        if (teacher != null) {
            s += ", ";
            s += teacher.name;
        }
        s += ", ";
        s += "students: ";
        for (int i = 0; i < students.size(); i++)
        {
            s += students.get(i).name;
            s += ", ";
        }
        return s;
    }
}
