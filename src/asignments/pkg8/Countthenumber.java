
package asignments.pkg8;
import java.util.Scanner;
import java.lang.String;

public class Countthenumber {

    public static void main(String[] args) {
        int count = 0;
        String str = "Java is fun";
        String[] words = str.split(" "); 
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) { // kiem tra xem chuoi chuoi rong khong , chuoi khong cho dem 
                count++;
            }
        }
        System.out.println("So lan tu trong chuoi la: " + count);
    }
 }
    
