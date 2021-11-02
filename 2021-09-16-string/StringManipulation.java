/*
 * String manipulation
 */

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args)
    {
        // Declaration
        String city, smallCity, bigCity;
        int num;
        char firstChar, lastChar;

        Scanner kb = new Scanner(System.in);

        // Input
        System.out.print("Enter your favorite city:");
        city = kb.nextLine();

        // Processing
        num = city.length();
        smallCity = city.toLowerCase();
        bigCity = city.toUpperCase();
        firstChar = city.charAt(0);
        lastChar = city.charAt(city.length() - 1);

        // Output
        System.out.println("Number of characters: " + num);
        System.out.println("Uppercase: " + bigCity);
        System.out.println("Lower case: " + smallCity);
        System.out.println("First and last char: " + firstChar + " " + lastChar);
    }
    
}
