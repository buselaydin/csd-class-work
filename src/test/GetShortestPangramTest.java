package test;

import util.string.StringUtil;

public class GetShortestPangramTest {
    public static void run(){
        java.util.Scanner kb = new java.util.Scanner(System.in);

        GetShortestPangramTRTest.run(kb);
        GetShortestPangramENTest.run(kb);
    }
}
class GetShortestPangramTRTest {
    public static void run(java.util.Scanner kb)
    {
        for (;;) {
            System.out.print("Bir yazı giriniz: ");
            String s = kb.nextLine();

            if ("elma".equals(s))
                break;

            System.out.printf("En kısa pangram : %s%n", StringUtil.getShortestPangramTR(s));
        }
    }
}

class GetShortestPangramENTest {
    public static void run(java.util.Scanner kb)
    {
        for (;;) {
            System.out.print("Input a text: ");
            String s = kb.nextLine();

            if ("apple".equals(s))
                break;

            System.out.printf("Shortest pangram : %s%n", StringUtil.getShortestPangramEN(s));
        }
    }
}
