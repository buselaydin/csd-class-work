package utils;

public class StringUtil {
    public static String padLeading(String s, int len, char ch)
    {
        int length = s.length();

        return len <= length ? s : repeat(len - length, ch) + s;

    }
    public static String padLeading(String s, int len)
    {
        return padLeading(s, len, ' ');
    }
    public static String padTrailing(String s, int len, char ch)
    {
        int length = s.length();

        for (int i = 0; length < len && i < len - length; ++i)
            s = s + ch;

        return s;
    }
    public static String padTrailing(String s, int len)
    {
        return padTrailing(s, len, ' ');
    }

    public static String repeat(int count, String s)
    {
        String str = "";

        while (count-- > 0)
            str += s;

        return str;
    }

    public static String repeat(int count, char ch)
    {
       return repeat(count, ch + "");
    }
}
