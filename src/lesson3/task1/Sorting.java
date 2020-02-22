package lesson3.task1;

import java.util.List;
import java.util.function.BiFunction;

import static java.util.Collections.swap;

public class Sorting<T> {
    private List<T> list;

    public Sorting(List<T> list) {
        this.list = list;
    }

    public List<T> insertion(BiFunction<T, T, Boolean> compare) {
        for (int i = 1; i < list.size(); i++)
            for (int j = i; j > 0 && compare.apply(list.get(j - 1), list.get(j)); j--) // пока j>0 и элемент j-1 > j, x-массив int
                swap(list, j - 1, j);
        return list;
    }
}
