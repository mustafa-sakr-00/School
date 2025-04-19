public class Student extends Person implements Printable{
    int age;
    Subject subject;

    @Override
    public String toStringShort() {
        return name;
    }

    @Override
    public String toStringLong() {
        String s = "";
        s += name;
        s += ", ";
        s += age;
        if (subject != null) {
            s += ", ";
            s += subject.toStringShort();
        }
        return s;
    }
}
