package util.numeric;

import static java.lang.Math.*;

public class NumberUtil {

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
}
