class Adder {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("Two integers: " + adder.add(5, 3));
        System.out.println("Three integers: " + adder.add(5, 3, 2));
        System.out.println("Two decimals: " + adder.add(2.5, 3.5));
    }
}
