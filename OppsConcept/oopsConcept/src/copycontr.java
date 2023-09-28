
class Student {
    String name;
    int age;

    public void studentInfo() {
        System.out.println("the student name is : " + name);
        System.out.println("the student age is : " + age);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;

    }

    Student() {
    }
}

public class copycontr {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Subham";
        s1.age = 24;

        Student s2 = new Student(s1);
        s2.studentInfo();
    }
}
