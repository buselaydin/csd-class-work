package util.string.test;

import java.util.Random;
import java.util.Scanner;

import static util.array.ArrayUtil.print;
import static util.string.StringUtil.fillRandomTextsTR;

public class FillRandomTextsTRTest {
    public static void run(){
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("enter the min value: ");
        int min = kb.nextInt();
        System.out.print("enter the bound value: ");
        int bound = kb.nextInt();

        for(;;) {
            System.out.print("Text a number: ");
            int count = kb.nextInt();

            if (count < 1)
                break;

            int n = r.nextInt(min, bound);

            String [] texts = new String[count];

            fillRandomTextsTR(r, texts, min, bound);
            print(texts);
            System.out.printf("n = %d%n", n);

            fillRandomTextsTR(r, texts, n);
            print(texts);
        }
    }

    public static void main(String [] args)
    {
        run();
    }
}
