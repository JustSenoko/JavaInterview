package lesson3.task2;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            System.out.printf("%d -> %d\n", i, fibonacci(i));
        }
    }

    static public int fibonacci(int n) {
        if (n > 2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        else
            return 1;
    }

}
