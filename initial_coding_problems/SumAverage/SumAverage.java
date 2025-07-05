/*
- Ask the user for 5 numbers
- Store them in an array of integers
- Use a for loop to sum them
- Calculate and print the average
*/
import java.util.Scanner;
import java.util.Arrays;
public class SumAverage {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        int i = 0;
        while (i < 5) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            numbers[i] = num;
            i++;
        }
        
        int numbersAdded = 0;
        for (int j = 0; j < numbers.length; j++) {
            numbersAdded += numbers[j];
        }
        System.out.println((double) numbersAdded / numbers.length);
    }
}
