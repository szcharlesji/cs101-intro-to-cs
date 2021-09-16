import java.util.Scanner;

public class President {
    public static void main(String[] args)
    {
        // Declaration
        String citizen;
        int age;
        Scanner kb = new Scanner(System.in);

        // Input
        System.out.println("Are you a natural born citizen?");
        citizen = kb.nextLine();

        System.out.println("What's your age?");
        age = kb.nextInt();

        // Output

        if (citizen.equals("Yes") && age >= 35)
        {
            System.out.println("You can be the president");
        }
        else
        {
            System.out.println("You cannot be the president");
        }
    }
    
}
