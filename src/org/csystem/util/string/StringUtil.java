package org.csystem.util.string;

import java.util.Random;

public class StringUtil {
    public static String alphabetAllTR = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz";
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

    public static String getRandomText(Random r, int n, String sourceText)
    {
        char [] c = new char[n];
        int len = sourceText.length();

        for (int i = 0; i < n; ++i)
            c[i] = sourceText.charAt(r.nextInt(len));

        return String.valueOf(c);
    }
    public static void fillRandomTexts(Random r, String [] texts, int n, String sourceText)
    {
        for (int i = 0; i < texts.length; ++i)
            texts[i] = getRandomText(r, n, sourceText);
    }

    public static void fillRandomTexts(Random r, String [] texts, int min, int bound,  String sourceText)
    {
        for (int i = 0; i < texts.length; ++i)
            texts[i] = getRandomText(r, r.nextInt(min, bound), sourceText);
    }

    public static void fillRandomTextsTR(Random r, String [] texts, int n)
    {
        fillRandomTexts(r,texts, n, alphabetAllTR);
    }

    public static void fillRandomTextsTR(Random r, String [] texts, int min, int bound)
    {
        fillRandomTexts(r,texts, min, bound, alphabetAllTR);
    }

    public static String join(String [] s, char delimiter)
    {
        return join(s, delimiter + "");
    }

    public static String join(String [] s, String delimiter)
    {
        String result = "";

        for (int i = 0; i < s.length; ++i)
            result += s[i] + delimiter;

        return result.substring(0, result.length() - delimiter.length());
    }

    public static String [] getRandomTexts(Random r, int count, int min, int bound, String sourceText)
    {
        String [] texts = new String[count];

        for (int i = 0; i < count; ++i)
            texts[i] = getRandomText(r, r.nextInt(min, bound), sourceText);

        return texts;
    }

    public static String [] getRandomTexts(Random r, int count, int n, String sourceText)
    {
        String [] texts = new String[count];

        for (int i = 0; i < count; ++i)
            texts[i] = getRandomText(r, n, sourceText);

        return texts;
    }

    public static String [] getRandomTextsTR(Random r, int count, int min, int bound)
    {
        return getRandomTexts(r, count, min, bound, alphabetAllTR);
    }

    public static String [] getRandomTextsTR(Random r, int count, int n)
    {
        return getRandomTexts(r, count, n, alphabetAllTR);
    }
}
