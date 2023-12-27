package util.numeric.test;

import java.util.Random;
import java.util.Scanner;

import static util.array.ArrayUtil.print;
import static util.numeric.NumberUtil.getDigitsInThrees;

public class GetDigitsinThreesTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Text a number: ");
        int n = kb.nextInt();

        while (n-- > 0) {
            long val = r.nextLong();
            System.out.printf("%d -> ", val);
            print(getDigitsInThrees(val));
            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        run();
    }
}
