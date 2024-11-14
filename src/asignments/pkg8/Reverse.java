
package asignments.pkg8;
import java.util.Scanner;
import java.lang.String;

public class Reverse {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print(" Enter the string: ");
        String st = str.nextLine();
        StringBuffer sb = new StringBuffer(st).reverse();
        System.out.println("Chuoi sau khi dao la : "+ sb);
    }
}
