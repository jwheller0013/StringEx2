/*
 * Exercise 6: Character Extraction
 * 
 * Write a program that asks the user for a word and then prints:
 * 1. The first character
 * 2. The last character
 * 3. The middle character (or two middle characters if the length is even)
 */
import java.util.Scanner;

public class Exercise6_CharacterExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        // TODO: Extract and print the first, last, and middle character(s)

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));
        System.out.println(word.charAt(word.length()/2));
        
        scanner.close();
    }
}

// Expected output (if input is "Programming"):
// First character: P
// Last character: g
// Middle character(s): am
