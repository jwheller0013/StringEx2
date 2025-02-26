/*
 * Exercise 11: String Trimming and Replacement
 * 
 * Write a program that asks the user for a sentence, then:
 * 1. Trims any leading and trailing spaces
 * 2. Replaces all instances of "and" with "&"
 */
import java.util.Scanner;

public class Exercise11_TrimmingAndReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // TODO: Trim the sentence and replace all "and" with "&"

        System.out.print(sentence.trim().replace("and", "&") );

        scanner.close();
    }
}

// Expected output (if input is "  Bread and butter and jam  "):
// Processed sentence: "Bread & butter & jam"
