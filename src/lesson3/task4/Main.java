package lesson3.task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = SieveEratosthenes.findPrimes(100);
        for (Integer prime : primes) {
            System.out.printf("%d  ", prime);
        }
    }
}
