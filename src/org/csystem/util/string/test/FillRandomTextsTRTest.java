package org.csystem.util.string.test;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.string.StringUtil.fillRandomTextsTR;

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
            ArrayUtil.print(texts);
            System.out.printf("n = %d%n", n);

            fillRandomTextsTR(r, texts, n);
            ArrayUtil.print(texts);
        }
    }

    public static void main(String [] args)
    {
        run();
    }
}
