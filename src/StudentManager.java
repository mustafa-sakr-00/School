import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    void add() {
        System.out.print("Enter student name: ");
        String name = scanner.next();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        Student student = new Student();
        student.name = name;
        student.age = age;

        students.add(student);

        Main.personManager.addExisting(student);
    }

    void remove() {
        print();

        System.out.print("Enter id to remove: ");
        int index = scanner.nextInt();

        Student student = students.get(index);

        Subject subject = student.subject;
        if (subject != null) {
            subject.students.remove(student);
        }

        students.remove(student);

        Main.personManager.remove(student);
    }

    void print() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ": " + students.get(i).toStringLong());
        }
    }

    void edit() {
        print();

        System.out.print("Enter id to edit: ");
        int index = scanner.nextInt();

        System.out.print("Enter student name: ");
        String name = scanner.next();

        System.out.print("Enter student age:");
        int age = scanner.nextInt();

        Student student = students.get(index);
        student.name = name;
        student.age = age;
    }

    void setSubject() {
        print();

        System.out.print("Enter student id: ");
        int studentIndex = scanner.nextInt();

        Main.subjectManager.print();

        System.out.print("Enter subject id: ");
        int subjectIndex = scanner.nextInt();

        Student student = students.get(studentIndex);
        Subject subject = Main.subjectManager.subjects.get(subjectIndex);

        Subject oldSubject = student.subject;
        if (oldSubject != null) {
            oldSubject.students.remove(student);
        }

        student.subject = subject;
        subject.students.add(student);
    }
}
