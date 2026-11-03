
class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    void study() {
        System.out.println("Course: " + course);
        System.out.println("Student is studying.");
    }
}

class Teacher extends Person {
    String subject;

    void teach() {
        System.out.println("Subject: " + subject);
        System.out.println("Teacher is teaching.");
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Simran";
        s.course = "BCA";

        Teacher t = new Teacher();
        t.name = "Rahul";
        t.subject = "Java";

        System.out.println("Student Details:");
        s.displayName();
        s.study();

        System.out.println();

        System.out.println("Teacher Details:");
        t.displayName();
        t.teach();
    }
}
