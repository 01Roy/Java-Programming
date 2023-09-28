// Constgructor is methods are call automaticaly when we create an object
class MyMainEmploy {
    private int id;
    private String name;

    public MyMainEmploy() {
        id = 34;
        name = "Subham";
        System.out.println("calling constri");
    }

    // this is the constructor no return type is mention here only you have to
    // intialzie the objects;
    public MyMainEmploy(String namein) {
        id = 34;
        name = namein;
        System.out.println("calling constri");
    }

    // above two are methode which require a return type
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}

public class Constrtor {

    public static void main(String[] args) {
        MyMainEmploy ep1 = new MyMainEmploy("Sanjana");
        System.out.println(ep1.getId());
        System.out.println(ep1.getName());
    }

}
