import java.util.*;
import java.lang.*;
public class DecimalToAny {
    public static void main(String[] s) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        int num = scn.nextInt();

        String newNum = Integer.toString(num, 16) ;
        System.out.println(newNum);
    }
}