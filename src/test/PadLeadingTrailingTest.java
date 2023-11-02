package test;

import utils.StringUtil;

public class PadLeadingTrailingTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for(;;) {
            System.out.println("Bir yazı giriniz: ");
            String s = kb.nextLine();

            if("elma".equals(s))
                break;

            System.out.println("Bir sayı giriniz: ");
            int count = kb.nextInt();

            System.out.printf("(%s)%n", StringUtil.padLeading(s, count, 'x'));
            System.out.printf("(%s)%n", StringUtil.padLeading(s, count));
            System.out.printf("(%s)%n", StringUtil.padTrailing(s, count, 'x'));
            System.out.printf("(%s)%n", StringUtil.padTrailing(s, count));
        }

    }
}
