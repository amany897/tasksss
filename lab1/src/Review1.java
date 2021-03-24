import java.util.Scanner;

/**
 * Created by pc on 1/29/2021.
 */
public class Review1 {
    static Scanner s = new Scanner(System.in);
    public static int [] a = new int [5];

    public static void main(String[] args) {
        input();
        output();

    }

    public static void input ()
    {
        System.out.println("Enter 5 number : ");
        for (int i = 0; i <a.length ; i++) {
            a [i] = s.nextInt();
        }
    }

    public static void output ()
    {
        System.out.print("a = [");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
            if (i!=a.length-1)
                System.out.print(",");
            else
                continue;
        }
        System.out.print("]");
    }
}


