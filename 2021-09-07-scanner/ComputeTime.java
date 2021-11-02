import java.util.Scanner;

public class ComputeTime {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter time in seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        seconds = seconds % 60;

        int hours = minutes / 60;
        minutes = minutes % 60;

        System.out.println("Time is " + hours + ":" + minutes + ":" + seconds);
    }
}
