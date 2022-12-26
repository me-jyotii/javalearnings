import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        for(int i=0; i<row; i++){
            for(int j=i; j<row-1; j++){
                System.out.print(" ");
            }
            for(int k=i; k>=0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<row; i++){
            for(int j=i; j>=0; j--){
                System.out.print(" ");
            }
            for(int k=i; k<row-1; k++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}