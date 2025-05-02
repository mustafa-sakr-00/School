public class Student extends Person implements Printable {
    private int age;
    private Subject subject;

    @Override
    public String toStringShort() {
        return getName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toStringLong() {
        String s = "";
        s += getName();
        s += ", ";
        s += age;
        if (subject != null) {
            s += ", ";
            s += subject.toStringShort();
        }
        return s;
    }
}
