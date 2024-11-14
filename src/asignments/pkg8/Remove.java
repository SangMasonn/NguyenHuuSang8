
package asignments.pkg8;

import java.util.Scanner;
import java.lang.String;
public class Remove {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Nhap chuoi  : ");
        String st = str.nextLine();
        String result = st.trim().replaceAll("\\s+", " ");
        System.out.println("Chuoi sau khi xoa khoang trang la : "+result );
    } 
    
}
