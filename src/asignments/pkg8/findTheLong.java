
package asignments.pkg8;
import java.lang.String;
import java.util.*;

public class findTheLong {
  
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Nhap chuoi :");
        String st = str.nextLine();
        String[] words = st.split(" "); 
        String max = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max.length()) { 
                 max=words[i];
            }
        }
        System.out.println("Tu dai nhat trong chuoi la: " + max);
    }
    
}
