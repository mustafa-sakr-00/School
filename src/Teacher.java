public class Teacher {
    String name;
    Subject subject;

    @Override
    public String toString() {
        String s = "";
        s += name;
        if (subject != null) {
            s += ", ";
            s += subject.name;
        }
        return s;
    }
}
