import java.util.ArrayList;
import java.util.Scanner;

public class TeacherManager {
    ArrayList<Teacher> teachers = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    void print() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(i + ": " + teachers.get(i).toStringLong());
        }
    }

    void add() {
        System.out.print("Enter name: ");
        String name = scanner.next();

        Teacher teacher = new Teacher();
        teacher.setName(name);

        teachers.add(teacher);

        Main.personManager.addExisting(teacher);
    }

    void remove() {
        print();

        System.out.print("Enter id to remove: ");
        int index = scanner.nextInt();

        Teacher teacher = teachers.get(index);

        Subject subject = teacher.getSubject();
        if (subject != null) {
            subject.setTeacher(null);
        }

        teachers.remove(teacher);

        Main.personManager.remove(teacher);
    }

    void edit() {
        print();

        System.out.print("Enter id to edit: ");
        int index = scanner.nextInt();

        System.out.print("Enter teacher name: ");
        String name = scanner.next();

        Teacher teacher = teachers.get(index);
        teacher.setName(name);
    }

    void setSubject() {
        print();

        System.out.print("Enter teacher id: ");
        int teacherIndex = scanner.nextInt();

        Main.subjectManager.print();

        System.out.print("Enter subject id: ");
        int subjectIndex = scanner.nextInt();

        Teacher teacher = teachers.get(teacherIndex);
        Subject subject = Main.subjectManager.subjects.get(subjectIndex);

        Subject oldSubject = teacher.getSubject();
        if (oldSubject != null) {
            oldSubject.setTeacher(null);
        }

        Teacher oldTeacher = subject.teacher;
        if (oldTeacher != null) {
            oldTeacher.setSubject(null);
        }

        teacher.setSubject(subject);
        subject.setTeacher(teacher);
    }
}
