public class MethodOverloading {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(3, 4));
        System.out.println(calc.sum((float) 3.2, (float) .4));
    }

}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

}
