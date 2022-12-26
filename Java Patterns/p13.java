import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        
        for(int i=65; i<(65+row); i++){
            for(int j=65; j<=i; j++){
                System.out.print((char)i);
            }
            System.out.println();
        }
    }    
}
