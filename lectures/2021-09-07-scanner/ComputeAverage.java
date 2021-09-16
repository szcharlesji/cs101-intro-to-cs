import java.util.Scanner;

public class ComputeAverage 
{
    public static void main(String[] args)
    {
        // New scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 3 numbers
        System.out.println("Enter 3 numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        // Computer the result
        double average = (number1 + number2 + number3) / 3.0;

        // // Prompt user to enter 3 numbers
        // System.out.println("Enter 3 numbers");
        // double number1 = input.nextDouble();
        // double number2 = input.nextDouble();
        // double number3 = input.nextDouble();
        
        // // Computer the result
        // double average = (number1 + number2 + number3) / 3;

        // Display the result
        System.out.println("The average of " + number1 + ", " + number2 + ", " + number3 + " is " + average);

    }
}
