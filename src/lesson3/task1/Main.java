package lesson3.task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {8,6,3,1,5,12};
        List<Integer> list = Arrays.asList(array);
        Sorting<Integer> sorting = new Sorting<>(list);
        for (Integer element : sorting.insertion((e1, e2) -> e1 > e2)) {
            System.out.println(element);
        }
    }

}
