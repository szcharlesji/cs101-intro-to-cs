// Show case calling by reference and by value
public class ByReference {
    public static void main(String[] args)
    {
        int a = 5;
        int[] b = {1, 2, 3};

        increment(a, b);
        System.out.println(a + " and ");

        for (int i = 0; i < b.length; i++)
        {
            System.out.println(i + " is " + b[i]);
        }
    }

    public static void increment(int x, int[] y)
    {
        x ++;
        y[0] = 0;
    }
    
}
