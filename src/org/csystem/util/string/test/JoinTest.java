package org.csystem.util.string.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;

public class JoinTest {

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

            String [] texts = StringUtil.getRandomTextsTR(r, count, min, bound);

            System.out.println("----------------------------------");

            ArrayUtil.print(texts);

            System.out.printf("Text: %s%n", StringUtil.join(texts, '-'));
            System.out.printf("Text: %s%n", StringUtil.join(texts, "--"));
        }
    }

    public static void main(String [] args)
    {
        run();
    }
}
