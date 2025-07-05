/*
- Ask the user for a word ✅
- Use a while loop to reverse the string manually (character by character) ✅
- Print the reversed word ✅
*/
import java.util.Scanner;
public class ReverseString {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asks user for a word
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        // Reverses user word
        String reversedWord = "";
        int i = 0;
        int index = word.length()-1;
        while (i < word.length()) {
            reversedWord += word.charAt(index);
            i++;
            index--;
        }
        System.out.println("Your word in reverse is: " + reversedWord);

    }
}
