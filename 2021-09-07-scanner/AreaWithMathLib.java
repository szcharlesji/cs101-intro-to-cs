import java.util.Scanner;

public class AreaWithMathLib {
    public static void main(String[] args)
    {
        // Declaration
        double radius, area, circum;
        Scanner kb = new Scanner(System.in);

        // Input
        System.out.println("Enter the radius");
        radius = kb.nextDouble();

        // Processing
        area = Math.PI * Math.pow(radius, 2);
        circum = radius * Math.PI * 2;

        // Output
        System.out.println("The area is " + area);
        System.out.println("The circumference is " + circum);
    }
}
