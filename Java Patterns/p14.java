import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                if(j % 2 != 0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }    
}
