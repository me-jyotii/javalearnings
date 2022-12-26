import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        for(int i=0; i<row; i++){
            for(int j=i; j<row; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}