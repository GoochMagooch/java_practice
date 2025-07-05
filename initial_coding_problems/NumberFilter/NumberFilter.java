/*
- Ask the user for 10 numbers ✅
- Add all numbers to an ArrayList ✅
- Use a for loop to traverse and keep only numbers greater than 50 in a new ArrayList ✅
- Print the filtered list
*/
import java.util.ArrayList;
import java.util.Scanner;
public class NumberFilter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // Asks user for 10 numbers
        int iterator = 0;
        while (iterator < 10) {
            System.out.print("Enter number #" + (iterator+1) + ": ");
            int number = input.nextInt();
            numbers.add(number);
            iterator++;
        }

        ArrayList<Integer> over50 = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 50) {
                over50.add(numbers.get(i));
            }
        }

        String output = "The numbers you chose that are over 50 are";
        for (int i = 0; i < over50.size(); i++) {
            if (i == over50.size()-1) {
                output += " and " + over50.get(i) + "!";
            } else if (i == 0) {
                output += " " + over50.get(i);
            } else {
                output += ", " + over50.get(i);
            }
        }
        System.out.println(output);
    }
}
