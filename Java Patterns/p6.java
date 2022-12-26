import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        for(int i=0; i<row; i++){
            for(int k=i; k<row-1; k++){
                System.out.print(" ");
            }
            for(int j=i; j>=0; j--){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
