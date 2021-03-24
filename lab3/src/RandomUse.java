import java.util.Random;

/**
 * Created by pc on 2/11/2021.
 */
public class RandomUse {
    static int [] a = new int[5];

    public static void main(String[] args) {
        RandomUse randomUse = new RandomUse();
        randomUse.fillRand(a);
        System.out.println(java.util.Arrays.toString(a));
    }

    private void fillRand (int [] array)
    {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        for (int i = 0; i < array.length ; i++) {
            array [i] = random.nextInt(10);
        }
    }
}
