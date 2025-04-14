public class Student {
    String name;
    int age;
    Subject subject;

    @Override
    public String toString() {
        String s = "";
        s += name;
        s += ", ";
        s += age;
        if (subject != null) {
            s += ", ";
            s += subject.name;
        }
        return s;
    }
}
