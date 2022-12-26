import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        for(int i=row; i>=1; i--){
            for(int j=i; j<=row; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}