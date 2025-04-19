public class Teacher {
   private String name;
    Subject subject;

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;

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
