import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                if(j % 2 != 0)
                    System.out.print('a');
                else
                    System.out.print('b');
            }
            System.out.println();
        }
    }    
}
