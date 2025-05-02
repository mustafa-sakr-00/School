public class Teacher extends Person implements Printable{
    Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toStringShort() {
        return getName();
    }

    @Override
    public String toStringLong() {
        String s = "";
        s += getName();
        if (subject != null) {
            s += ", ";
            s += subject.toStringShort();
        }
        return s;
    }
}
