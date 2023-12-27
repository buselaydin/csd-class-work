package util;

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

    public static String getShortestPangramEN(String s)
    {
        String result = s;

        int end = s.length();

        while (end != 0) {
            int begin = 0;

            while (begin != end) {
                String str = s.substring(begin++, end);

                if (str.length() >= 26 && isPangramEN(str) && str.length() < result.length())
                    result = str;

            }

            --end;
        }
        return result;
    }
    public static String getShortestPangramTR(String s)
    {
        String result = s;

        int end = s.length();

        while (end != 0) {
            int begin = 0;

            while (begin != end) {
                String str = s.substring(begin++, end);

                if (str.length() >= 29 && isPangramTR(str) && str.length() < result.length())
                    result = str;
            }

            --end;
        }

        return result;
    }

    public static boolean isPangramTR(String s)
    {
        return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
    }

    public static boolean isPangramEN(String s)
    {
        return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuwxvyz");
    }

    public static boolean isPangram(String s, String alphabet)
    {
        int len = alphabet.length();

        for (int i = 0; i < len; ++i)
            if (s.indexOf(alphabet.charAt(i)) == -1)
                return false;

        return true;
    }
}
