import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        for(int i=0; i<row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<row; k++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}