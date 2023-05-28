package helloWorld;


public class Main {
    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            if (n % 2 == 0) {
                System.out.println("Hello");
            } else {
                System.out.println("World");
            }
        }
    }
}