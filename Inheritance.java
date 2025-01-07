public class Inheritance {
    public static void main(String[] args) {
        // fish shark = new fish();
        // shark.eat("fish");
        // shark.teeth = 223;
        // System.out.println(shark.teeth);

        dogs lebrador = new dogs();
        lebrador.breathe();

    }
    
}

class Animal {
    String color;

    void eat(String food) {
        System.out.println("eats " + food); // constructor
    }

    void breathe() {
        System.out.println("breaths");
    }

}

// class fish extends Animal {
// int teeth;
// }

class mammals extends Animal {
    int leg;
}

class dogs extends mammals {

}