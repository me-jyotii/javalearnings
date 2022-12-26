import java.util.Scanner;
public class AnyToDecimal {
    public static void main(String[] s) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        String num = scn.nextLine();
        
        System.out.println("Enter base : ");
        int base = scn.nextInt();
        
        Integer decimalNum = Integer.valueOf(num,base);
        System.out.println(decimalNum);
    }
}
