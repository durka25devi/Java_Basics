package Day_4;

public class Method{

    // No-argument,no-return
    public static void greet() {
        System.out.println("Hello,Welcome to Java methods");
    }
    // No-argument,with return
    public static int getRandomNumber() {
        return 42; // returning a sample number
    }
    // With-argument,no-return
    public static void printSquare(int num) {
        System.out.println("Square of " + num + " is: " + (num * num));
    }
    // With-argument,with return
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Calling no-argument, no-return
        greet();

        // Calling no-argument, with return
        int random = getRandomNumber();
        System.out.println("Random number: " +random);

        // Calling with-argument, no-return
        printSquare(5);

        // Calling with-argument, with return
        int result = multiply(6, 7);
        System.out.println("Multiplication result: " +result);
    }
}

