import java.util.ArrayList;

public class Subject implements Printable{
    String id;
    String name;
    Teacher teacher;
    ArrayList<Student> students = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    String getStudentsString() {
        String s = "";
        for (int i = 0; i < students.size(); i++) {
            s += i + ": " + students.get(i).getName();
            s += "\n";
        }
        return s;
    }

    @Override
    public String toStringShort() {
        return getName();
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
