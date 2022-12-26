import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int toprint=1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(toprint++);
            }
            System.out.println();
        }
    }    
}