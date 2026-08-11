class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "M.LIKITHA";
        age = 20;
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorPrograms {

    public static void main(String[] args) {

        System.out.println("===== DEFAULT CONSTRUCTOR =====");

        Student student1 = new Student();
        student1.display();

        System.out.println("\n===== PARAMETERIZED CONSTRUCTOR =====");

        Student student2 = new Student("Anu", 21);
        student2.display();
    }
}
