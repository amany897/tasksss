/**
 * Created by pc on 2/18/2021.
 */
public class OldPair {
    Object first;
    Object second;

    public OldPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "OldPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        OldPair bookPair = new OldPair("book1",11);
        Student s1 = new Student("A",12,121);
        Student s2 = new Student("B",13,131);
        OldPair comp = new OldPair(s1,s2);

        String x = (String) bookPair.getFirst();
        System.out.println(bookPair.toString());
    }
}
