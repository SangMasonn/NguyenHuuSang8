
package asignments.pkg8;
import java.util.Scanner;
import java.lang.String;
public class CharacterCounter {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        
        System.out.print("Enter the character to count: ");
        char characterToCount = scanner.next().charAt(0);

        int count = countOccurrences(input, characterToCount);
        System.out.println("The character '" + characterToCount + "' appears " + count + " times in the string.");

       
    }

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

