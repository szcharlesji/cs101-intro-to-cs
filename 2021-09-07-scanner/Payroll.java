import java.util.*;

public class Payroll {

    public static void main(String[] args)
    {
        // Declaration
        String name;
        int hours;
        double payrate, grosspay;

        Scanner kb = new Scanner(System.in);

        // Input
        System.out.println("Enter your name :");
        name = kb.nextLine();
        
        System.out.println("Enter the hours");
        hours = kb.nextInt();
        
        System.out.println("Enter your pay rate");
        payrate = kb.nextDouble();
        
        // Processing
        grosspay = hours * payrate;

        // Output
        System.out.println(name + ", your gross pay is " + grosspay);
    }
}
