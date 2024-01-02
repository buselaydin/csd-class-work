package org.csystem.util.numeric;

import static java.lang.Math.*;

public class NumberUtil {

    public static String [] onesTR = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};

    public static String [] tensTR = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
    public static int [] getDigits(long val, int n)
    {
        int [] values = new int[(int)(log10((val = abs(val))) / n) + 1];
        int powOfTen = (int) pow(10, n);

        for (int i = values.length - 1; i >= 0; values[i] = (int)(val % powOfTen), val /= powOfTen, --i)
            ;

        return values;
    }

    public static int [] getDigitsInThrees(long val)
    {
        return getDigits(val, 3);
    }

    public static String numToTextTR(long val) {
        if (val == 0)
            return "sıfır";

        String text = val < 0 ? "eksi" : "";

        val = abs(val);

        int a = (int) (val / 100);
        int b = (int) (val / 10 % 10);
        int c = (int) (val % 10);

        if (a != 0) {
            if (a != 1)
                text += onesTR[a];
            text += "yüz";
        }

        if (b != 0)
            text += tensTR[b];

        if (c != 0)
            text += onesTR[c];

        return text;
    }
}
