
package asignments.pkg8;

import java.util.Scanner;
import java.lang.String;

public class PalindromeChecker {


    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Nhap chuoi :  ");
        String st = str.nextLine();
        String restr = new StringBuffer(st).reverse().toString();
        if(st.equalsIgnoreCase(restr)){
            System.out.println(st + " la mot Palindrome !");
        }else{
            System.out.println(st + " khong phai la mot Palindrome !");
        }
        
    }
}

