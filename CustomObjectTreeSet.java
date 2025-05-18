import java.util.TreeSet;
import java.util.Comparator;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CustomObjectTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(Comparator.comparing(s -> s.name));

        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 23));

        System.out.println("Students sorted by name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

