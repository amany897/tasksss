import java.util.Scanner;

/**
 * Created by pc on 2/3/2021.
 */
public class Ops {
    static int [] a = {11,12,13,14,15};
    static int y ;
    static int z = 0 ;
    static int [] a1 = new int[5];
    static int num = 0;
    static int [] a2 = new int[5];

    public static void main(String[] args) {
        Ops x = new Ops();
        x.print(a);
        System.out.println();
        x.reverse();
        x.print(a);
        System.out.println();
        x.print2();
        x.reverse();

        System.out.println();
        System.out.println("------------------------------");

        x.shiftRight();
        x.print(a);
        System.out.println();
        z = y ;
        x.shiftLeft();
        x.print(a);
        System.out.println();
        z = 0;
        x.shiftLeft();
        x.print(a);
        System.out.println();
        z = y ;
        x.shiftRight();
        x.print(a);

        System.out.println();
        System.out.println("------------------------------");

        Scanner s = new Scanner(System.in);
        x.add(s.nextInt());
        x.print2();

        System.out.println();
        System.out.println("------------------------------");

        while (true)
        {
            x.sortedAdding(s.nextInt());
            x.print(a2);
        }

    }

    public void reverse ()
    {
        int n = a.length -1;
        for (int i =0 ; i<a.length/2 ; i++)
        {
            int t = a[i];
            a[i] = a[n];
            a[n] = t;
            n--;
        }
    }

    public void print (int []a)
    {
        System.out.print("[");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
            if (i != a.length-1 )
                System.out.print(",");
            else
                continue;
        }
        System.out.print("]");
    }

    public void print2 ()
    {
        System.out.print("[");
        for (int i = 0; i <a1.length ; i++) {

            if (i == a1.length-1 )
                System.out.print(a1[i]);

            else
                System.out.print(a1[i]+",");
        }
        System.out.print("]");
    }

    public void shiftRight ()
    {
        y = a[a.length-1];
        int i;
        for (i=a.length-1 ; i>0 ; i--)
        {
            a[i] = a[i-1];
        }
        a[i] = z;
    }

    public void shiftLeft ()
    {
        y = a[0];
        int i;
        for (i=0 ; i<a.length-1 ; i++)
        {
            a[i] = a[i+1];
        }
        a[i] = z;
    }

    public void add (int newE)
    {
        if (num < a1.length)
        {
            a1[num] = newE;
            num++;
        }
        else
            System.out.println("The array is full.");

    }

    public void sortedAdding (int newE)
    {
        if (num < a2.length)
        {
            num++;
            int i = num -1;
            while (i>0 && a2[i-1]>newE)
            {
                a2[i] = a2[i-1];
                i--;
            }
            a2[i] = newE;
        }
        else
            System.out.println("Array is full.");
    }
}



