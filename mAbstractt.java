public class mAbstractt {
    public static void main(String[] Args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}

abstract class Animal {

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("walks on 4 legs");
    }   
}

class Hen extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
