import java.util.Scanner;

public class GuessingNumber 
{
    public static void main(String[] args)
    {
        //declaration
        int numberToGuess, numberEntered, guesses = 0;
        Scanner kb = new Scanner(System.in);

        //input
        numberToGuess = (int)(100*Math.random());
        
        //processing
        System.out.println("Guess an integer between 0 and 99: ");
        
        do
        {
            numberEntered = kb.nextInt();
            guesses ++;
            
            if (numberEntered > numberToGuess)
            {
                System.out.println("\nToo high, try again");
            }
            else if (numberEntered < numberToGuess)
            {
                System.out.println("\nToo low, try again");
            }

        } while (numberEntered != numberToGuess);

        System.out.println("You have guessed it with " + guesses + "trials");
    }    
}
