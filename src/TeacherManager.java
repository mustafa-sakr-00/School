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
        teacher.name = name;

        teachers.add(teacher);

        Main.personManager.addExisting(teacher);
    }

    void remove() {
        print();

        System.out.print("Enter id to remove: ");
        int index = scanner.nextInt();

        Teacher teacher = teachers.get(index);

        Subject subject = teacher.subject;
        if (subject != null) {
            subject.teacher = null;
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
        teacher.name = name;
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

        Subject oldSubject = teacher.subject;
        if (oldSubject != null) {
            oldSubject.teacher = null;
        }

        Teacher oldTeacher = subject.teacher;
        if (oldTeacher != null) {
            oldTeacher.subject = null;
        }

        teacher.subject = subject;
        subject.teacher = teacher;
    }
}
