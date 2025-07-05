/*
Ask the user for how many students they want to enter.
Prompt the user to enter that exact number of student names, one at a time.
Store each student’s name in a resizable collection.
After all names are entered, print each student’s name, one per line, with "Student: " before the name.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class StudentInfoCollector {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        // User Input
        System.out.print("Enter the number of students you'll be adding: ");
        int choice = input.nextInt();
        input.nextLine();

        int i = 0;
        while (i < choice) {
            System.out.print("Enter Student #" + (i+1) + ": ");
            String student = input.nextLine();
            students.add(student);
            i++;
        }

        System.out.println();

        for (int j = 0; j < students.size(); j++) {
            System.out.println("Student: " + students.get(j));
        }
    }
}
