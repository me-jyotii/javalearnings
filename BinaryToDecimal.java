import java.util.*;
public class BinaryToDecimal {
    public static int binaryToDecimal(int n) {
        int res = 0;
        int itr = 1;
        while(n>0){
            int rem = n%10;
            res += rem*itr;
            itr*=2;
            n/=10;
        }
        return res;
    }
    public static void main(String[] arg) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(binaryToDecimal(num));        
    }    
}
