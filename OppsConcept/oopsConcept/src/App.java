class Pen {
    String colour;
    String Name;

    public void penColor() {
        System.out.println("the colure of the pen is : " + this.colour + " the name of the pen is : " + this.Name);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Pen pen1 = new Pen();
        pen1.Name = "Link galcer";
        pen1.colour = "blue";

        Pen pen2 = new Pen();
        pen2.Name = "Link ocean";
        pen2.colour = "Black";

        pen1.penColor();
        pen2.penColor();

    }
}
