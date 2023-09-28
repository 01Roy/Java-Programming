
class Student {
    String name;
    int age;

    // FUNCTION OVER LOADING:- it means same function name but diffrent work

    public void studInfo(String name) {
        System.out.println(name);
    }

    public void studInfo(int age) {
        System.out.println(age);
    }

    public void studInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

}

public class FunctionoverLoad {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Subham";
        s1.age = 24;

        s1.studInfo(s1.name, s1.age);
    }
}
