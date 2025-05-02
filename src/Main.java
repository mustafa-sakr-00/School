import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static PersonManager personManager = new PersonManager();
    static StudentManager studentManager = new StudentManager();
    static SubjectManager subjectManager = new SubjectManager();
    static TeacherManager teacherManager = new TeacherManager();

    static void personOperation() {
        System.out.println("Choose operation (print)");
        String op = scanner.next();
        if (op.equals("print")) {
            personManager.print();
        } else {
            System.out.println("Unknown operation!");
        }
    }

    static void studentOperation() {
        System.out.println("Choose operation (add - edit - remove - print - setSubject)");
        String op = scanner.next();
        if (op.equals("add")) {
            studentManager.add();
        } else if (op.equals("edit")) {
            studentManager.edit();
        } else if (op.equals("remove")) {
            studentManager.remove();
        } else if (op.equals("print")) {
            studentManager.print();
        } else if (op.equals("setSubject")) {
            studentManager.setSubject();
        } else {
            System.out.println("Unknown operation!");
        }
    }

    static void teacherOperation() {
        System.out.println("Choose operation (add - edit - remove - print - setSubject)");
        String op = scanner.next();
        if (op.equals("add")) {
            teacherManager.add();
        } else if (op.equals("edit")) {
            teacherManager.edit();
        } else if (op.equals("remove")) {
            teacherManager.remove();
        } else if (op.equals("print")) {
            teacherManager.print();
        } else if (op.equals("setSubject")) {
            teacherManager.setSubject();
        } else {
            System.out.println("Unknown operation!");
        }
    }

    static void subjectOperation() {
        System.out.println("Choose operation (add - edit - remove - print - setTeacher - addStudent - removeStudent)");
        String op = scanner.next();
        if (op.equals("add")) {
            subjectManager.add();
        } else if (op.equals("edit")) {
            subjectManager.edit();
        } else if (op.equals("remove")) {
            subjectManager.remove();
        } else if (op.equals("print")) {
            subjectManager.print();
        } else if (op.equals("setTeacher")) {
            subjectManager.setTeacher();
        } else if (op.equals("addStudent")) {
            subjectManager.addStudent();
        } else if (op.equals("removeStudent")) {
            subjectManager.removeStudent();
        } else {
            System.out.println("Unknown operation!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to school manager app");

        String ans;

        do {
            System.out.println("Choose operation (student - teacher - subject - person)");
            String op = scanner.next();

            if (op.equals("student")) {
                studentOperation();
            } else if (op.equals("teacher")) {
                teacherOperation();
            } else if (op.equals("subject")) {
                subjectOperation();
            } else if (op.equals("person")) {
                personOperation();
            } else {
                System.out.println("Unknown operation!");
            }

            System.out.println("Do you wish to continue? y/n");
            ans = scanner.next();
        } while (ans.equals("y"));
    }
}