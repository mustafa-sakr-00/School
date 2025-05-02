import java.util.ArrayList;
import java.util.Scanner;

public class SubjectManager {
    ArrayList<Subject> subjects = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    void print() {
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(i + ": " + subjects.get(i).toStringLong());
        }
    }

    void add() {
        System.out.print("Enter subject name: ");
        String name = scanner.next();

        Subject subject = new Subject();
        subject.setName(name);

        subjects.add(subject);
    }

    void edit() {
        print();

        System.out.print("Enter id to edit: ");
        int index = scanner.nextInt();

        System.out.print("Enter subject name: ");
        String name = scanner.next();

        Subject subject = subjects.get(index);
        subject.setName(name);
    }

    void remove() {
        print();

        System.out.print("Enter id to remove: ");
        int index = scanner.nextInt();

        Subject subject = subjects.get(index);

        Teacher teacher = subject.teacher;
        if (teacher != null) {
            teacher.subject = null;
        }

        for (int i = 0; i < subject.students.size(); i++) {
            Student student = subject.students.get(i);
            student.setSubject(null);
        }

        subjects.remove(subject);
    }

    void setTeacher() {
        print();

        System.out.print("Enter subject id: ");
        int subjectIndex = scanner.nextInt();

        Main.teacherManager.print();

        System.out.print("Enter teacher id: ");
        int teacherIndex = scanner.nextInt();

        Subject subject = subjects.get(subjectIndex);
        Teacher teacher = Main.teacherManager.teachers.get(teacherIndex);

        Subject oldSubject = teacher.subject;
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

    void addStudent() {
        print();

        System.out.print("Enter subject id: ");
        int subjectIndex = scanner.nextInt();

        Main.studentManager.print();

        System.out.print("Enter student id: ");
        int studentIndex = scanner.nextInt();

        Subject subject = subjects.get(subjectIndex);
        Student student = Main.studentManager.students.get(studentIndex);

        Subject oldSubject = student.getSubject();
        if (oldSubject != null) {
            oldSubject.students.remove(student);
        }

        subject.students.add(student);
        student.setSubject(subject);
    }

    void removeStudent() {
        print();

        System.out.print("Enter subject id: ");
        int subjectIndex = scanner.nextInt();

        Subject subject = subjects.get(subjectIndex);

        System.out.println(subject.getStudentsString());

        System.out.print("Enter student id: ");
        int studentIndex = scanner.nextInt();

        Student student = subject.students.get(studentIndex);

        student.setSubject(null);

        subject.students.remove(student);
    }
}
