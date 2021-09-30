import java.util.*;
public class ArrayProcessing {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("How many numbers do you want to process?");
        int num = kb.nextInt();

        double[] numbers = new double[num];

        getValues(numbers);

        System.out.println(getAverage(numbers));

        System.out.println(getTotal(numbers));

        System.out.println(getHighest(numbers));

        System.out.println(getLowest(numbers));
    }
    
    public static void getValues(double[] arr)
    {
        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter a number: ");
            arr[i] = kb.nextDouble();
        }
    }

    public static double getTotal(double[] arr)
    {
        double total = 0;
        for (int i = 0; i < arr.length; i++)
        {
            total += arr[i];
        }
        return total;
    }
    
    public static double getAverage(double[] arr)
    {
        double average;
        average = getTotal(arr) / arr.length;

        return average;
    }

    public static double getHighest(double[] arr)
    {
        double high = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > high)
            {
                high = arr[i];
            }
        }

        return high;
    }
    public static double getLowest(double[] arr)
    {
        double low = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < low)
            {
                low = arr[i];
            }
        }

        return low;
    }
}
