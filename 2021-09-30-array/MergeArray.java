import java.util.*;

public class MergeArray {
    public static void main(String[] args)
    {
        int[] a = {1, 2};
        int[] b = {3, 4};

        System.out.println(Arrays.toString(merge(a, b)));
    }

    public static int[] merge (int[] a, int[] b)
    {
        int[] c = new int[a.length + b.length];
        int i;

        for (i = 0; i < a.length; i++)
        {
            c[i] = a[i];
        }

        for (i = 0; i < b.length; i++)
        {
            c[a.length + i] = b[i];
        }

        return c;
    }   
}
