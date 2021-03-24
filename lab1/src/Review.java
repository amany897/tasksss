import java.util.Scanner;

/**
 * Created by pc on 1/29/2021.
 */
public class Review {
    public static void main(String[] args) {
        System.out.println("hello world");

        System.out.println("---------------------------");

        int x = 3;
        System.out.println("x = "+x);

        System.out.println("---------------------------");

        int [] a = {1,2,3,4,5};
        System.out.println("a without loop : "+a);

        System.out.println("---------------------------");

        for (int i = 0; i <a.length ; i++) {
            System.out.println("a ["+i+"] = "+a[i]);
        }

        System.out.println("---------------------------");

        Scanner s = new Scanner(System.in);
        int [] a1 = new int[5];
        for (int i = 0; i <a1.length ; i++) {
            a1[i] = s.nextInt();
        }

        System.out.println("---------------------------");

        for (int i = 0; i <a1.length ; i++) {
            System.out.println("a ["+i+"] = "+a1[i]);
        }

        System.out.println("---------------------------");

        System.out.print("The array a1 in one line : \n"+"[");
        for (int i = 0; i <a1.length ; i++) {
            System.out.print(a1[i]);
            if (i!=a1.length-1)
                System.out.print(",");
            else
                continue;
        }
        System.out.println("]");

        System.out.println("---------------------------");


    }
}


