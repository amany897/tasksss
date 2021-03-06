/**
 * Created by pc on 2/25/2021.
 */

//the object of class Node doesnt connect directly to objects of class SinglyLinkedList
//so the class must be static
//inner classes can be private

public class SinglyLinkedList <E> {
    private Node <E> head = null;
    private Node <E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public boolean isEmpty (){
        return size == 0;
    }

    public int getSize (){
        return size;
    }

    public E first (){
        if (isEmpty())
            return null;
        return head.getElement();
    }

    public E last (){
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    public void addFirst (E ex){
        head = new Node<E>(ex,head);
        if (isEmpty())
            tail = head;
        size++;
    }

    public void addLast (E ex){
        Node <E> newest = new Node<E>(ex,null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst ()
    {
        if (isEmpty())
            return null;
        E deletedElement = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty())
            tail = null;
        return deletedElement;
    }

    public String print ()
    {
        Node <E> i = head;
        String all = "";
        while (i!=null)
        {
            all = all + i.getElement().toString() + "\n";
            i = i.getNext();
        }
        return all;
    }

    private static class Node <E> {
        private E element ;
        private Node <E> next ;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
