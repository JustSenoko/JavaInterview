package lesson3.task4;

import java.util.ArrayList;
import java.util.List;

public class SieveEratosthenes {
    private static List<Integer> list;

    public static List<Integer> findPrimes(int n) {
        list = initList(n);
        for (int i = 1; i < list.size(); i++) {
            deleteMultiplesOf(list.get(i), i + 1);
        }
        return list;
    }

    private static void deleteMultiplesOf(Integer num, int index) {
        for (int i = index; i < list.size(); i++) {
            if (list.get(i) % num == 0) {
                list.remove(i);
                i--;
            }
        }

    }

    private static List<Integer> initList(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        return list;
    }


}
