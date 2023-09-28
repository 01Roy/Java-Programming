// learn inhertance and  super class

class Room {
    int lenght, breath;

    Room(int x, int y) { // constructor
        lenght = x;
        breath = y;
    }

    int area() {
        return lenght * breath;
    }
}

class BedRoom extends Room { // inhertance class Room
    int height;

    BedRoom(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    int volume() {
        return lenght * breath * height;
    }
}

public class Inheritancesuper {
    public static void main(String[] args) {
        BedRoom room1 = new BedRoom(14, 12, 10);
        System.out.println("area of the room 1 : " + room1.area());
        System.out.println("volume of the room1 : " + room1.volume());
    }
}
