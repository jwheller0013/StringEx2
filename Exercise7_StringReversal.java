/*
 * Exercise 7: String Reversal
 * 
 * Write a program that asks the user for a string and then
 * prints the same string in reverse order.
 */
import java.util.Scanner;

public class Exercise7_StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // TODO: Create and print the reversed string

        System.out.print("Reverse of string: ");
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        System.out.print(reversed);
        
        scanner.close();
    }
}

// Expected output (if input is "Hello"):
// Reversed string: olleH
