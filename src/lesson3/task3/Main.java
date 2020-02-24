package lesson3.task3;

public class Main {
    public static void main(String[] args) {
        TwoSideLinkedList<Integer> list = new TwoSideLinkedListImpl<>();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.display();

        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.display();

        System.out.printf("list contains 6? %s\n", list.contains(6));

        list.remove(6);
        list.removeFirst();
        list.removeLast();
        list.display();
    }
}
