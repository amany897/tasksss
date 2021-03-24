/**
 * Created by pc on 3/4/2021.
 */
public class Test {
    public static void main(String[] args) {
        CircularlyLinkedList <Integer> list = new CircularlyLinkedList<>();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        int n = list.getSize();
        for (int i = 0; i < n ; i++) {
            System.out.println(list.first());
            list.rotate();
        }

        System.out.println("-------------------------------------");

        DoublyLinkedList <Integer> list1 = new DoublyLinkedList<>();
        list1.addFirst(3);
        list1.addFirst(2);
        list1.addFirst(1);

        int n1 = list1.getSize();
        for (int i = 0; i < n1 ; i++) {
            System.out.println(list1.removeFirst());
        }
    }
}
