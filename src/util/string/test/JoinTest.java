package util.string.test;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static util.array.ArrayUtil.print;
import static util.string.StringUtil.*;

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

            String [] texts = getRandomTextsTR(r, count, min, bound);

            System.out.println("----------------------------------");

            print(texts);

            System.out.printf("Text: %s%n", join(texts, '-'));
            System.out.printf("Text: %s%n", join(texts, "--"));
        }
    }

    public static void main(String [] args)
    {
        run();
    }
}
