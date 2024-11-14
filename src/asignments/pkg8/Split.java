
package asignments.pkg8;
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class Split {

    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] words = sentence.split(" "); // tach chuoi dua tren khoang trang
        System.out.println(Arrays.toString(words));
    
    }
    
}
