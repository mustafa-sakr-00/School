import java.util.ArrayList;

public class PersonManager {
    ArrayList<Person> persons = new ArrayList<>();

    void addExisting(Person person) {
        persons.add(person);
    }

    void remove(Person person) {
        persons.remove(person);
    }

    void print() {
        /*for (int i = 0;  i < persons.size(); i++) {
            System.out.println(persons.get(i).name);
        }*/
        /*for (int i = 0;  i < persons.size(); i++) {
            System.out.println(persons.get(i).toString());
        }*/
        /*for (int i = 0;  i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("student: " + student.toString());
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("teacher: " + teacher.toString());
            }
        }*/
        for (int i = 0;  i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("student: " + student.toStringLong());
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("teacher: " + teacher.toStringLong());
            }
        }
    }
}
