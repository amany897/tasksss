import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by pc on 2/25/2021.
 */
public class ReadTextToSingly {
    public static void main(String[] args) {
        SinglyLinkedList <String> list = new SinglyLinkedList<>();
        try {
            Scanner s = new Scanner(new File("D:\\L2S2\\Data Structure\\LAB\\New Text Document.txt"));
            while (s.hasNext())
            {
                list.addLast(s.nextLine());
            }
            System.out.println(list.print());
            System.out.println(list.getSize());
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

}
