package lesson3.task3;

public interface TwoSideLinkedList<E> extends Iterable<E> {
    void insertFirst(E value);

    E removeFirst();

    boolean remove(E value);

    boolean contains(E value);

    boolean isEmpty();

    int size();

    void display();

    E getFirstValue();

    Entry getFirst();

    void insertLast(E value);
    E removeLast();
    E getLastValue();

    class Entry<E> {
        private final E value;
        private Entry<E> next;
        private Entry<E> previous;

        Entry(E value) {
            this.value = value;
        }

        void setNext(Entry<E> next) {
            this.next = next;
        }

        void setPrevious(Entry<E> previous) {
            this.previous = previous;
        }

        public E getValue() {
            return value;
        }

        Entry<E> getPrevious() {
            return previous;
        }

        Entry<E> getNext() {
            return next;
        }
    }
}
