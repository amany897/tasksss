/**
 * Created by pc on 3/4/2021.
 */
public class DoublyLinkedList <E> {

    private Node <E> header;
    private Node <E> trailer;
    private int size = 0;

    public DoublyLinkedList() {
        header = new Node<E>(null,null,null);
        trailer = new Node<E>(null,header,null);
        header.setNext(trailer);
    }

    public boolean isEmpty (){
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public E first (){
        if (isEmpty())
            return null;
        return header.getNext().getElement();
    }

    public E last (){
        if (isEmpty())
            return null;
        return trailer.getPrevious().getElement();
    }

    private void addBetween (E e,Node <E> p , Node <E> s){
        Node <E> newest = new Node<E>(e,p,s);
        p.setNext(newest);
        s.setPrevious(newest);
        size++;
    }

    public void addFirst (E e){
        addBetween(e,header,header.getNext());
    }

    public void addLast (E e){
        addBetween(e,trailer.getPrevious(),trailer);
    }

    private E remove (Node <E> x){
        Node <E> p = x.getPrevious();
        Node <E> s = x.getNext();
        p.setNext(s);
        s.setPrevious(p);
        return x.getElement();
    }

    public E removeFirst (){
        if (isEmpty())
            return null;
        return remove(header.getNext());
    }

    public E removeLast (){
        if (isEmpty())
            return null;
        return remove(trailer.getPrevious());
    }

    private static class Node <E> {
        E element ;
        Node <E> previous ;
        Node <E> next ;

        public Node(E element, Node<E> previous, Node<E> next) {
            this.element = element;
            this.previous = previous;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
