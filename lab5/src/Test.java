/**
 * Created by pc on 2/25/2021.
 */
public class Test {
    public static void main(String[] args) {
        SinglyLinkedList <Integer> list = new SinglyLinkedList<>();
        SinglyLinkedList <Integer> list2 = new SinglyLinkedList<>();
        list.addFirst(11);
        list.addFirst(12);
        list.addLast(13);
        System.out.println(list.print());

        int n = list.getSize();
        for (int i = 0; i < n ; i++) {
            System.out.println(list.removeFirst());
        }
        System.out.println(list.getSize());

        list.addFirst(11);
        list.addFirst(12);
        list.addLast(13);

        for (int i = 0; i < n ; i++) {
            int x = list.removeFirst();
            System.out.println(x);
            list2.addLast(x);
        }
        System.out.println();
        System.out.println(list.getSize());
        System.out.println(list2.getSize());
    }
}
