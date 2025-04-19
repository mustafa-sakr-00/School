import java.util.ArrayList;

public class Subject implements Printable{
    String id;
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
    public String toStringShort() {
        return name;
    }

    @Override
    public String toStringLong() {
        String s = "";
        s += name;
        if (teacher != null) {
            s += ", ";
            s += teacher.toStringShort();
        }
        s += ", ";
        s += "students: ";
        for (int i = 0; i < students.size(); i++)
        {
            s += students.get(i).toStringShort();
            s += ", ";
        }
        return s;
    }
}
