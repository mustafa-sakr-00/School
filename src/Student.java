public class Student {
    private String name;
    private double age;
    Subject subject;

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public Double getAge() {
        return age;
    }

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
