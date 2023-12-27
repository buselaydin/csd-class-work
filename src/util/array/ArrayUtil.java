package util.array;

public class ArrayUtil {
    public static void print(String [] s)
    {
        for (int i = 0; i < s.length; ++i)
            System.out.println(s[i]);
    }

    public static void print(int [] s)
    {
        for (int i = 0; i < s.length; ++i)
            System.out.print(s[i] + " ");
    }
}
