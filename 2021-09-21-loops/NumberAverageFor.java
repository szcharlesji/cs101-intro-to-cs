import java.util.Scanner;

public class NumberAverageFor {

    public static void main(String[] args)
    {
        //declaration

        double num, average, total;
        int n;
        Scanner kb = new Scanner(System.in);

        //input
        System.out.println("How many numbers do you want to enter");
        n = kb.nextInt();

        //processing
        total = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter a number: ");
            num = kb.nextDouble();
            total = total + num;

        }

        average = total/n;

        //output
        System.out.println("The average is " + average);
    }
    
}
