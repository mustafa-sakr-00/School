public class Teacher extends Person implements Printable{
    Subject subject;

    @Override
    public String toStringShort() {
        return name;
    }

    @Override
    public String toStringLong() {
        String s = "";
        s += name;
        if (subject != null) {
            s += ", ";
            s += subject.toStringShort();
        }
        return s;
    }
}
