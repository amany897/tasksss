/**
 * Created by pc on 2/18/2021.
 */
public class pair <A,B> {
    A first ;
    B second ;

    public pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        pair <String,Integer> bookPair = new pair<>("b1",12);
        String x = bookPair.getFirst();
        System.out.println(bookPair);

    }
}
