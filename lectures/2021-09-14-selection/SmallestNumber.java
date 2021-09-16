/*
 * Samllest Number
 */

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args)
    {
        // Declaration
        double num1, num2, num3, smallest;
        Scanner kb = new Scanner(System.in);

        // Input
        System.out.print("Enter three numbers separated by a space");
        num1 = kb.nextDouble();
        num2 = kb.nextDouble();
        num3 = kb.nextDouble();

        // Processing
        if ((num1 < num2) && (num1 < num3))
        {
            smallest = num1;
        }
        else if (num2 < num3)
        {
            smallest = num2;
        }
        else
        {
            smallest = num3;
        }

        // Output
        System.out.println("The smallest one is " + smallest);
        System.out.println("The smallest one is " + Math.min(num1, Math.min(num2, num3)));
    }
    
}
