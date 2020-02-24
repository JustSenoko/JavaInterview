package lesson3.task3;

import java.util.Iterator;

public interface ListIterator<E> extends Iterator<E> {
    void reset();

    void insertBefore(E value);

    void insertAfter(E value);
}
