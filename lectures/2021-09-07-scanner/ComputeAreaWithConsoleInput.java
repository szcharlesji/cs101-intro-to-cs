import java.util.Scanner;

public class ComputeAreaWithConsoleInput
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute Area
        double area = radius * radius * 3.14159;

        // Display output
        System.out.println("The area for the circle of radius of " + radius + " is " + area);

    }
}
