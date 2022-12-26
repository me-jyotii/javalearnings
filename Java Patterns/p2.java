import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}