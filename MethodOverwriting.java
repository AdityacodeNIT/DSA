public class MethodOverwriting {
    public static void main(String[] args) {
        Dear d1 = new Dear();
        d1.eat();

    }
}

class Animal {

    void eat() {
        System.out.println("Eats anything");
    }
}

class Dear extends Animal {
    void eat() {
        System.out.println("Eats Grass");
    }
}
